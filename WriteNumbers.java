import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class WriteNumbers {

    public static void main(String args[]) throws FileNotFoundException {

        PrintStream diskWriter = new PrintStream("numbers.txt");
        Scanner diskScanner = new Scanner(new File("numbers.txt"));
        Random myRandom = new Random();
        int count = 0;
        int myNumbers;

        while (count <= 9){

            myNumbers = myRandom.nextInt(100);
            count++;
            diskWriter.print(myNumbers + " ");

//            count++;

        }

        System.out.println(diskScanner.nextLine());

//        int myNumbers = myRandom.nextInt(10 + 1);

        diskScanner.close();
        diskWriter.close();

    }
}
