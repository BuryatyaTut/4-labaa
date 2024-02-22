package test;

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
          return S();
     }


     private Node makeNode(final String name, final Node... list) {
          return new Node(name, list);
     }


     private Node P() throws ParserException {
    final Node res = new Node("P");
    final Token token = lexer.getCurToken();
    		if(token == Token.Tuple) {
 			final Node var0 = new Node(lexer.getCurText());
res.getChildren().add(var0);
lexer.nextToken();

final Node var1 = new Node(lexer.getCurText());
res.getChildren().add(var1);
lexer.nextToken();

final Node var2 = E();
res.getChildren().add(var2);
final Node var3 = new Node(lexer.getCurText());
res.getChildren().add(var3);
lexer.nextToken();

final Node var4 = N();
res.getChildren().add(var4);
 			
 			 return res;
		}

    throw new RuntimeException("Not expected token in P. Token = " + lexer.getCurText());
}

private Node A() throws ParserException {
    final Node res = new Node("A");
    final Token token = lexer.getCurToken();
    		if(token == Token.Array) {
 			final Node var0 = new Node(lexer.getCurText());
res.getChildren().add(var0);
lexer.nextToken();

final Node var1 = new Node(lexer.getCurText());
res.getChildren().add(var1);
lexer.nextToken();

final Node var2 = T();
res.getChildren().add(var2);
final Node var3 = new Node(lexer.getCurText());
res.getChildren().add(var3);
lexer.nextToken();

final Node var4 = N();
res.getChildren().add(var4);
 			
 			 return res;
		}

    throw new RuntimeException("Not expected token in A. Token = " + lexer.getCurText());
}

private Node S() throws ParserException {
    final Node res = new Node("S");
    final Token token = lexer.getCurToken();
    		if(token == Token.Var) {
 			final Node var0 = new Node(lexer.getCurText());
res.getChildren().add(var0);
lexer.nextToken();

final Node var1 = new Node(lexer.getCurText());
res.getChildren().add(var1);
lexer.nextToken();

final Node var2 = new Node(lexer.getCurText());
res.getChildren().add(var2);
lexer.nextToken();

final Node var3 = C();
res.getChildren().add(var3);
 			
 			 return res;
		}

    throw new RuntimeException("Not expected token in S. Token = " + lexer.getCurText());
}

private Node C() throws ParserException {
    final Node res = new Node("C");
    final Token token = lexer.getCurToken();
    		if(token == Token.Array || token == Token.Tuple) {
 			final Node var0 = A();
res.getChildren().add(var0);
 			
 			 return res;
		}

    throw new RuntimeException("Not expected token in C. Token = " + lexer.getCurText());
}

private Node T() throws ParserException {
    final Node res = new Node("T");
    final Token token = lexer.getCurToken();
    		if(token == Token.Name) {
 			final Node var0 = new Node(lexer.getCurText());
res.getChildren().add(var0);
lexer.nextToken();

final Node var1 = Ts();
res.getChildren().add(var1);
final Node var2 = N();
res.getChildren().add(var2);
 			
 			 return res;
		}

    throw new RuntimeException("Not expected token in T. Token = " + lexer.getCurText());
}

private Node E() throws ParserException {
    final Node res = new Node("E");
    final Token token = lexer.getCurToken();
    		if(token == Token.Array || token == Token.Name) {
 			final Node var0 = T();
res.getChildren().add(var0);
final Node var1 = Es();
res.getChildren().add(var1);
 			
 			 return res;
		}

    throw new RuntimeException("Not expected token in E. Token = " + lexer.getCurText());
}

private Node Es() throws ParserException {
    final Node res = new Node("Es");
    final Token token = lexer.getCurToken();
    		if(token == Token.Comma) {
 			final Node var0 = new Node(lexer.getCurText());
res.getChildren().add(var0);
lexer.nextToken();

final Node var1 = T();
res.getChildren().add(var1);
final Node var2 = Es();
res.getChildren().add(var2);
 			
 			 return res;
		}

    final Node epsNode = new Node("Es");
epsNode.getChildren().add(new Node("Eps"));

return epsNode
;
}

private Node N() throws ParserException {
    final Node res = new Node("N");
    final Token token = lexer.getCurToken();
    		if(token == Token.Nullable) {
 			final Node var0 = new Node(lexer.getCurText());
res.getChildren().add(var0);
lexer.nextToken();

 			
 			 return res;
		}

    final Node epsNode = new Node("N");
epsNode.getChildren().add(new Node("Eps"));

return epsNode
;
}

private Node Ts() throws ParserException {
    final Node res = new Node("Ts");
    final Token token = lexer.getCurToken();
    		if(token == Token.Lpar) {
 			final Node var0 = new Node(lexer.getCurText());
res.getChildren().add(var0);
lexer.nextToken();

final Node var1 = T();
res.getChildren().add(var1);
final Node var2 = new Node(lexer.getCurText());
res.getChildren().add(var2);
lexer.nextToken();

 			
 			 return res;
		}

    final Node epsNode = new Node("Ts");
epsNode.getChildren().add(new Node("Eps"));

return epsNode
;
}

}