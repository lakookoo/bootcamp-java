package wb7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
       

        System.out.println("\n\n");
        try {
            Path path = Paths.get("emails.txt");
            Files.lines(path)
                .filter(email -> !email.startsWith("Spam"))
                .forEach(line -> System.out.println(line));
        } catch (IOException e){
            System.out.println(e);
        }
        
    }
}
