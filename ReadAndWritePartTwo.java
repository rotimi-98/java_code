import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class ReadAndWritePartTwo {

    public static void main(String args[]) throws FileNotFoundException {

        PrintStream diskWriter = new PrintStream("data.txt");
        Scanner diskScanner = new Scanner(new File("data.txt"));


        diskWriter.println("Hello");

        System.out.println(diskScanner.next());

        diskScanner.close();
        diskWriter.close();
    }

}

