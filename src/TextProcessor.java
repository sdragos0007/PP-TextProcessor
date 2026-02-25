import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class TextProcessor {
    public static void main(String[] args) {
        String filePath = "src/input.txt";
        String content = "";

        try {
            content = new String(Files.readAllBytes(Paths.get(filePath)));
        } catch (IOException e) {
            System.out.println("Eroare la citirea fisierului: " + e.getMessage());
            return;
        }

        content = content.replaceAll("\\p{Punct}", "");

        content = content.replaceAll("\\s+", " ");

        content = content.toUpperCase();

        System.out.println("Text procesat: " + content);
    }
}