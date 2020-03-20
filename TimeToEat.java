import java.util.Scanner;

public class TimeToEat {

    public static void main(String args []){

        Scanner keyboard = new Scanner(System.in);

        System.out.print("What is the current hour? ");
        int hour = keyboard.nextInt();

        if(hour > 24){

            System.out.print("Please enter a time between 0 and 24");
            return;

        }

        switch(hour){

            case 6:
            case 7:
            case 8:
            case 9:
                System.out.println("Breakfast is served");
                break;

            case 11:
            case 12:
            case 13:
                System.out.println("Time for lunch");
                break;

            case 17:
            case 18:
            case 19:
            case 20:
                System.out.println("It's dinner time");
                break;

                default:
                    System.out.println("Sorry, you'll have to wait, or go get a snack");
                    break;




        }




    }
}
