import java.util.Scanner;

public class ModifyGarageParkingFees {

    static double parkingFees = 2.50;

    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);


        System.out.println("What's the amount to park in this New York garage? ");
        double amount = keyboard.nextDouble();
        amount = amount + parkingFees;

        System.out.println("The total amount including a $2 parking tip is $" + amount);


    }
}
