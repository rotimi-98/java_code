import java.util.Random;
import java.util.Scanner;

public class TheOldSwitcheroo {

    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        Random myRandom = new Random();
        int randomNumber;

        System.out.print("Type your question, my child: ");
        keyboard.nextLine();

        randomNumber = myRandom.nextInt(10) + 1;

        switch (randomNumber){
            case 1:
                System.out.println("Yes. Isn't it obvious?");
                break;

            case 2:
                System.out.println("No, and don't ask again.");
                break;

            case 3:
                System.out.println("Yessir, yessir! Three bags full.");
                break;

            case 4:
                System.out.println("What part of 'no' don't you understand?");
                break;

            case 5:
                System.out.println("No chance, Lance");
                break;

            case 6:
                System.out.println("Sure, whatever.");
                break;

            case 7:
                System.out.println("Yes, but only if you're nice to me.");
                break;

            case 8:
                System.out.println("Yes (as if I care). ");
                break;

            case 9:
                System.out.println("No, not until Cromwell seizes Dover.");
                break;

            case 10:
                System.out.println("No, not until Nell squeezes Rover.");
                break;

                default:
                    System.out.print("You think you have problems?");
                    System.out.println(" My random number generator is broken!");
                    break;

        }

        System.out.println("Goodbye");
        keyboard.close();
    }
}
