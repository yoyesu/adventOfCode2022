package utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CustomFileReader {

    public static BufferedReader readInputFile(String filePath) throws IOException {
        java.io.FileReader fileReader = null;
        try {
            fileReader = new java.io.FileReader(filePath);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        return new BufferedReader(fileReader);
    }
}
