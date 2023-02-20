import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
public class program6 {
    public static void main (String[] args) {
        
        Files.writeString(file, "TEST");
        try {
            Files.createFile(Path.of("file.txt"));
            
        } catch (Exception e) {
            System.out.println("Файл уже существует");
        }
}
}