
package array;

public enum Token {
    Array("Array", false), Lpar("<", false), Comma(",", false), Var("var", false), Rpar(">", false), Eps("eps", false), Tuple("Tuple", false), Nullable("\\?", true), Name("\\w+", true), Sep(":", false), END("$", false);

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
