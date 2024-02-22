
package expr;

public enum Token {
    Div("/", false), RBR(")", false), Number("[0-9]+", true), Mul("*", false), Eps("eps", false), Plus("+", false), LBR("(", false), Minus("-", false), END("$", false);

    private final String text;

    private final boolean isRegex;

    private Token(final String text, final boolean isRegex) {
       this.text = text;
       this.isRegex = isRegex;
    }

    public String getText() {
        return text;
    }

    public boolean getIsRegex() {
        return isRegex;
    }

}
