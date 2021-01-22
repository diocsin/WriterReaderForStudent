package examples.write;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteEx {
    public static void main(String[] args) {
        String fileName = "World1.txt";
        String str = "Hello";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(str);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
