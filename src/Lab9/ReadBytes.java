package Lab9;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadBytes {
    public static void main(String[] args) {
        try {
            FileInputStream inputStream = new FileInputStream("src/Lab9/bytes.txt");
            int item;
            while ((item = inputStream.read()) != -1) {
                System.out.printf("ascii = %d, char = '%c'\n", item, (char) item);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
