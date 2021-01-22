package examples.write;

import java.io.*;

public class TempFile {

    public static void main(String[] args) {
        String toWrite = "Hello";
        File tmpFile;
        FileWriter writer = null;
        try {
            tmpFile = File.createTempFile("test", ".tmp");
            writer = new FileWriter(tmpFile);
            writer.write(toWrite);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
