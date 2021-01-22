package examples.write;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteAppend {

    public static void main(String[] args) {
        String fileName = "World1.txt";
        String str = "Hello";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.append(" ");
            writer.append("World");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
