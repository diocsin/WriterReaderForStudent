package examples.write;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutput {
    public static void main(String[] args) {
        String fileName = "World1.txt";
        String str = "Hello";
        try (FileOutputStream outputStream = new FileOutputStream(fileName)) {
            byte[] strToBytes = str.getBytes();
            outputStream.write(strToBytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
