package expr;


public class Converter {
    private int globalIndex = 0;
    private final Node tree;

    public Converter(final Node tree) {
        this.tree = tree;
    }

    public String convert() {
       return "digraph {\n" + convert(tree, -1, 0, new StringBuilder()) + "}";
    }

    private String convert(final Node tree, final int prev, final int index, final StringBuilder sb) {
        if (tree.getChildren().isEmpty() && prev != -1) {
            sb.append(String.format("%s [label = \"%s\"]", index, tree.getText())).append('\n');
            sb.append(prev).append(" -> ").append(index).append('\n');
            globalIndex++;
            return sb.toString();
        }
        sb.append(String.format("%s [label = \"%s\"]", index, tree.getText())).append('\n');
        if (prev != -1) {
            sb.append(prev).append(" -> ").append(index).append('\n');
        }
        for (final Node sub : tree.getChildren()) {
            convert(sub, index, ++globalIndex, sb);
        }
        return sb.toString();
    }

}
