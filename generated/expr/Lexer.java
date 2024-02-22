package expr;

import java.io.IOException;
import java.io.InputStream;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class Lexer {
    private final InputStream stream;
    private Token curToken;
    private int curChar;

    private String curText;


    public Lexer(final InputStream stream) {
       this.stream = stream;
       nextChar();
    }

    public Token getCurToken() {
        return curToken;
    }

    public String getCurText() {
        return curText;
    }

    public int getCurChar() {
        return curChar;
    }

    private boolean isBlank(final int ch) {
        return Character.isWhitespace(ch);
    }

    private void nextChar() {
        try {
           curChar = stream.read();
        } catch (final IOException e) {
           throw new RuntimeException(e);
        }
    }

    private boolean notSkip = false;

    public void nextToken() throws ParserException  {
        if (!notSkip) {
            while (isBlank(curChar)) {
                nextChar();
            }
        }

        final StringBuilder sb = new StringBuilder();
        while (!isBlank(curChar)) {
            if (curChar == -1) {
                curToken = Token.END;
                curText = "$";
                return;
            }

            if (notSkip) {
                notSkip = false;
            }

            final String hlp = String.valueOf((char) curChar);

            if (hlp.equals("/") || hlp.equals(")") || hlp.equals("[0-9]+") || hlp.equals("*") || hlp.equals("eps") || hlp.equals("+") || hlp.equals("(") || hlp.equals("-")) {
    sb.append((char) curChar);
    break;
}


            sb.append((char) curChar);
            nextChar();

            final String hlp1 = String.valueOf((char) curChar);
             if (hlp1.equals("/") || hlp1.equals(")") || hlp1.equals("[0-9]+") || hlp1.equals("*") || hlp1.equals("eps") || hlp1.equals("+") || hlp1.equals("(") || hlp1.equals("-")) {
    notSkip = true;
    break;
}


        }
        final String res = sb.toString();

        if (!notSkip) {
            nextChar();
        }

        		if (res.equals("/")) {
    		curToken = Token.Div;
    		curText = "/";
    		return;
		}

		if (res.equals(")")) {
    		curToken = Token.RBR;
    		curText = ")";
    		return;
		}

		if (res.equals("*")) {
    		curToken = Token.Mul;
    		curText = "*";
    		return;
		}

		if (res.equals("eps")) {
    		curToken = Token.Eps;
    		curText = "eps";
    		return;
		}

		if (res.equals("+")) {
    		curToken = Token.Plus;
    		curText = "+";
    		return;
		}

		if (res.equals("(")) {
    		curToken = Token.LBR;
    		curText = "(";
    		return;
		}

		if (res.equals("-")) {
    		curToken = Token.Minus;
    		curText = "-";
    		return;
		}

		Pattern pNumber = Pattern.compile("[0-9]+");
		Matcher mNumber = pNumber.matcher(res);
		if (mNumber.matches()) {
     		curToken = Token.Number;
     		curText = res;
     		return;
		}


        throw new ParserException("Not expected " + res);
    }
}
