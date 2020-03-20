import java.util.Scanner;

public class Problem11 {

    public static void main(String args[]){

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please type a number: ");
        int number = keyboard.nextInt();

        if(number > 0){

            System.out.println("positive");
        } else if(number == 0){

            System.out.println("zero");

        }else if(number < 0){

            System.out.println("negative");
        }else{

            System.out.println("Type a number");
        }

        keyboard.close();
    }
}
