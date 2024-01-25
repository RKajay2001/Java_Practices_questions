package Java_Practices_problem;
import java.io.*;

public class FileReader {

    public static void main(String[] args) {
        // Using try-with-resources to automatically close the FileInputStream
        try (FileInputStream f = new FileInputStream("D:/Ajay/demo.txt")) {
            int data;
            while ((data = f.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            // Handle IO exception, e.g., file not found or unable to read
            e.printStackTrace();
        }
    }
}

