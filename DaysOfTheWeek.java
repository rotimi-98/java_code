import java.util.Random;
import java.util.Scanner;

public class DaysOfTheWeek {

    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        int days;
        Random myRandom = new Random();

//        System.out.print("What day of the week is it? "); // This code works with the next line...
//        days = keyboard.nextInt(); // This code prompts you for the day of the week

        System.out.println("What day of the week is it? ");
        days = myRandom.nextInt(6) + 1; // This code randomly chooses a number of day between 1 and 7.

        switch (days){
            case 1:
                System.out.print("Sunday!");
                break;

            case 2:
                System.out.print("Monday!");
                break;

            case 3:
                System.out.print("Tuesday!");
                break;

            case 4:
                System.out.print("Wednesday!");
                break;

            case 5:
                System.out.print("Thursday!");
                break;

            case 6:
                System.out.print("Friday!");
                break;

            case 7:
                System.out.print("Saturday!");
                break;

                default:
                    System.out.print("You must be nuts!!!");
                    break;
        }

        System.out.println(" It is a good day!!!");
        keyboard.close();

    }
}
