import java.util.Scanner;

public class RgbModel {

    public static void main(String args[]){

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter a RGB number... (between 0 and 7): ");
        int colours = keyboard.nextInt();

        switch (colours){

            case 0:
                System.out.println("Black");
                break;

            case 1:
                System.out.println("Blue");
                break;

            case 2:
                System.out.println("Green");
                break;

            case 3:
                System.out.println("Cyan");
                break;

            case 4:
                System.out.println("Red");
                break;

            case 5:
                System.out.println("Magenta");
                break;

            case 6:
                System.out.println("yellow");
                break;

            case 7:
                System.out.println("White");
                break;

                default:
                    System.out.println("You don't know what you're doing");
        }
    }
}
