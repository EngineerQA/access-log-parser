import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count = 0; //счётчик верно указанных файлов

        while (true) {

            System.out.println("Enter the path to the file:");
            String path = new Scanner(System.in).nextLine();
            File file = new File(path);
            boolean fileExists = file.exists();
            boolean isDirectory = file.isDirectory();
            if (!fileExists) {
                System.out.println("Error: The specified file does not exist");
            }
            if (isDirectory) {
                System.out.println("Error: The specified path is the path to the folder");

            }
            if (fileExists && !isDirectory) {
                count += 1;
                System.out.println("The path is specified correctly");
                System.out.println("This is the file number " + count);
            }
        }
    }
}