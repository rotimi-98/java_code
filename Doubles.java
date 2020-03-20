import java.util.Scanner;

public class Doubles {

    public static void main(String args []){

        Scanner keyboard = new Scanner(System.in);
        int previousNumber = 0;

        System.out.println("Please enter a number: ");
        int currentNumber = keyboard.nextInt();

        while(currentNumber != previousNumber){

            System.out.println("Please enter another number: ");
            previousNumber = currentNumber;
//            System.out.println(currentNumber);
            currentNumber = keyboard.nextInt();
        }

        System.out.println("Done!");

        keyboard.close();

    }
}

