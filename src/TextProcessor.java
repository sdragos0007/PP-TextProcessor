import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class TextProcessor {
    public static void main(String[] args) {
        String filePath = "input.txt";
        String content = "";

        try {
            content = new String(Files.readAllBytes(Paths.get(filePath)));
        } catch (IOException e) {
            System.out.println("Eroare la citirea fisierului: " + e.getMessage());
            return;
        }

        // TODO: Urmatoarele procesari (eliminare punctuatie, etc.) vor fi adaugate aici
    }
}