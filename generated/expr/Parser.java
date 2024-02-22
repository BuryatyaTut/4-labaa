package expr;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Parser {
     private final Lexer lexer;

     public Parser(final InputStream stream) throws ParserException {
         this.lexer = new Lexer(stream);
         this.lexer.nextToken();
     }

     public Node parse() throws ParserException {
          return E();
     }


     private Node makeNode(final String name, final Node... list) {
          return new Node(name, list);
     }


     private Node T() throws ParserException {
    final Node res = new Node("T");
    final Token token = lexer.getCurToken();
    		if(token == Token.Number || token == Token.LBR) {
 			final Node var0 = F();
res.getChildren().add(var0);
final Node var1 = Ts(var0.val);
res.getChildren().add(var1);
 			res.val = var1.val;
 			 return res;
		}

    throw new RuntimeException("Not expected token in T. Token = " + lexer.getCurText());
}

private Node E() throws ParserException {
    final Node res = new Node("E");
    final Token token = lexer.getCurToken();
    		if(token == Token.Number || token == Token.LBR) {
 			final Node var0 = T();
res.getChildren().add(var0);
final Node var1 = Es(var0.val);
res.getChildren().add(var1);
 			res.val = var1.val;
 			 return res;
		}

    throw new RuntimeException("Not expected token in E. Token = " + lexer.getCurText());
}

private Node F() throws ParserException {
    final Node res = new Node("F");
    final Token token = lexer.getCurToken();
    		if(token == Token.LBR) {
 			final Node var0 = new Node(lexer.getCurText());
res.getChildren().add(var0);
lexer.nextToken();

final Node var1 = E();
res.getChildren().add(var1);
final Node var2 = new Node(lexer.getCurText());
res.getChildren().add(var2);
lexer.nextToken();

 			res.val = var1.val;
 			 return res;
		}

		if(token == Token.Number) {
 			final Node var0 = new Node(lexer.getCurText());
res.getChildren().add(var0);
lexer.nextToken();

 			res.val = Integer.parseInt(var0.getText());
 			 return res;
		}

    throw new RuntimeException("Not expected token in F. Token = " + lexer.getCurText());
}

private Node Es(double out1) throws ParserException {
    final Node res = new Node("Es");
    final Token token = lexer.getCurToken();
    		if(token == Token.Plus) {
 			final Node var0 = new Node(lexer.getCurText());
res.getChildren().add(var0);
lexer.nextToken();

final Node var1 = T();
res.getChildren().add(var1);
final Node var2 = Es(var1.val);
res.getChildren().add(var2);
 			res.val = out1 + var2.val;
 			 return res;
		}

		if(token == Token.Minus) {
 			final Node var0 = new Node(lexer.getCurText());
res.getChildren().add(var0);
lexer.nextToken();

final Node var1 = T();
res.getChildren().add(var1);
final Node var2 = Es(var1.val);
res.getChildren().add(var2);
 			res.val = out1 - var2.val;
 			 return res;
		}

    final Node epsNode = new Node("Es");
epsNode.getChildren().add(new Node("Eps"));
epsNode.val = out1;
return epsNode
;
}

private Node Ts(double out1) throws ParserException {
    final Node res = new Node("Ts");
    final Token token = lexer.getCurToken();
    		if(token == Token.Mul) {
 			final Node var0 = new Node(lexer.getCurText());
res.getChildren().add(var0);
lexer.nextToken();

final Node var1 = F();
res.getChildren().add(var1);
final Node var2 = Ts(var1.val);
res.getChildren().add(var2);
 			res.val = out1 * var2.val;
 			 return res;
		}

		if(token == Token.Div) {
 			final Node var0 = new Node(lexer.getCurText());
res.getChildren().add(var0);
lexer.nextToken();

final Node var1 = F();
res.getChildren().add(var1);
final Node var2 = Ts(var1.val);
res.getChildren().add(var2);
 			res.val = out1 / var2.val;
 			 return res;
		}

    final Node epsNode = new Node("Ts");
epsNode.getChildren().add(new Node("Eps"));
epsNode.val = out1;
return epsNode
;
}

}