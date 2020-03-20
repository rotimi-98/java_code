import java.util.Scanner;

public class FlashDriveUpdated {

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);


        System.out.println("How much does the flash drive costs? ");
        double amount = keyboard.nextDouble();
        amount = amount * 2;

        System.out.println("The total cost of a flash drive is $" + amount);


    }

}




