package examples.write;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesWrite {
    public static void main(String[] args) {

        String fileName = "World1.txt";
        String str = "Hello";
        Path path = Paths.get(fileName);
        byte[] strToBytes = str.getBytes();
        try {
            Files.write(path, strToBytes);
            String read = Files.readAllLines(path).get(0);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
