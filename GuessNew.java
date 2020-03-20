import java.util.Random;
import java.util.Scanner;

public class GuessNew {

    public static void main(String args[]){

        Scanner keyboard = new Scanner(System.in);
        Random myRandom = new Random();
        int userNumbers;
        int randomNumber;

        randomNumber = myRandom.nextInt(10) + 1;

        System.out.print("Please guess a number: ");
        userNumbers = keyboard.nextInt();

        while(randomNumber != userNumbers){
            System.out.println(userNumbers);
            System.out.print("Please guess another number: ");
//            System.out.println("");
//            System.out.print("Please guess another number: ");
            userNumbers = keyboard.nextInt();

        }

        System.out.println("You guessed right... user number and randomly generated number are the same: " + userNumbers);
        keyboard.close();

    }
}
