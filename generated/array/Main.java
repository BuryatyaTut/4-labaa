package array;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParserException, IOException {
        final Scanner scanner = new Scanner(System.in);
        final String input = scanner.nextLine();

        final Parser parser = new Parser(new ByteArrayInputStream((input + " ").getBytes()));
        final Node node = parser.parse();
        final String graphTree = new Converter(node).convert();
        Files.writeString(Paths.get("array_file.txt"), graphTree);
    }
}
