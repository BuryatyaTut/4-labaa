package array;

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

            if (hlp.equals("Array") || hlp.equals("<") || hlp.equals(",") || hlp.equals("var") || hlp.equals(">") || hlp.equals("eps") || hlp.equals("Tuple") || hlp.equals("\\?") || hlp.equals("\\w+") || hlp.equals(":")) {
    sb.append((char) curChar);
    break;
}


            sb.append((char) curChar);
            nextChar();

            final String hlp1 = String.valueOf((char) curChar);
             if (hlp1.equals("Array") || hlp1.equals("<") || hlp1.equals(",") || hlp1.equals("var") || hlp1.equals(">") || hlp1.equals("eps") || hlp1.equals("Tuple") || hlp1.equals("\\?") || hlp1.equals("\\w+") || hlp1.equals(":")) {
    notSkip = true;
    break;
}


        }
        final String res = sb.toString();

        if (!notSkip) {
            nextChar();
        }

        		if (res.equals("Array")) {
    		curToken = Token.Array;
    		curText = "Array";
    		return;
		}

		if (res.equals("<")) {
    		curToken = Token.Lpar;
    		curText = "<";
    		return;
		}

		if (res.equals(",")) {
    		curToken = Token.Comma;
    		curText = ",";
    		return;
		}

		if (res.equals("var")) {
    		curToken = Token.Var;
    		curText = "var";
    		return;
		}

		if (res.equals(">")) {
    		curToken = Token.Rpar;
    		curText = ">";
    		return;
		}

		if (res.equals("eps")) {
    		curToken = Token.Eps;
    		curText = "eps";
    		return;
		}

		if (res.equals("Tuple")) {
    		curToken = Token.Tuple;
    		curText = "Tuple";
    		return;
		}

		if (res.equals(":")) {
    		curToken = Token.Sep;
    		curText = ":";
    		return;
		}

		Pattern pNullable = Pattern.compile("\\?");
		Matcher mNullable = pNullable.matcher(res);
		if (mNullable.matches()) {
     		curToken = Token.Nullable;
     		curText = res;
     		return;
		}

		Pattern pName = Pattern.compile("\\w+");
		Matcher mName = pName.matcher(res);
		if (mName.matches()) {
     		curToken = Token.Name;
     		curText = res;
     		return;
		}


        throw new ParserException("Not expected " + res);
    }
}
