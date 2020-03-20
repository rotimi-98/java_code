import java.util.Scanner;

public class Discount {

    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        int age;
        double price = 0.00;
        char reply;

        System.out.print("How old are you? ");
        age = keyboard.nextInt();

        System.out.print("Have a coupon? (Y/N) ");
        reply = Character.toUpperCase(keyboard.findWithinHorizon(".", 0).charAt(0));
    //  reply = keyboard.findWithinHorizon(".", 0).charAt(0);
        if(age >= 12 && age < 65){

            price = 9.25;

        }

        if(age < 12 || age >= 65){

            price = 5.25;

        }

        if(reply == 'Y'){

            price -= 2.00;

        }

        // if(reply == 'Y' || reply == 'y'){

        //  price -= 2.00;

        //}

        if(reply != 'Y' && reply != 'N'){

            System.out.println("Huh?");

        }

        //if(reply != 'Y' && reply != 'y' && reply != 'N' && reply != 'n'){

        //    System.out.println("Huh?");
        //}


        System.out.println("Please pay $" + price + ". Enjoy the show!");

        keyboard.close();
    }
}
