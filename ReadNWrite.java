import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class ReadNWrite {

    public static void main(String args[]) throws FileNotFoundException {
        Scanner diskScanner = new Scanner(new File("rawData.txt"));
        PrintStream diskWriter = new PrintStream("cookedData.txt");
        double unitPrice, total;
        int quantity;

//        System.out.print("Hankees  ");
//        System.out.println("Socks");
//        System.out.print(7);
//        System.out.print("        ");
//        System.out.println(3);

        unitPrice = diskScanner.nextDouble();
        quantity = diskScanner.nextInt();

        total = unitPrice * quantity;

        diskWriter.println(total);

        diskScanner.close();
        diskWriter.close();

    }
}
