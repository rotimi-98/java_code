import java.util.Scanner;

public class CheckAgeForDiscount {

    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        int age;
        double price = 0.00;
        char reply;

        System.out.print("How old are you? ");
        age = keyboard.nextInt();

        System.out.print("Have a coupon? (Y/N) ");
        reply = keyboard.findWithinHorizon(".", 0).charAt(0);

        if(age >= 12 && age < 65){
            price = 9.25;
        }
        if(age < 12 || age >= 65){
            price = 5.25;
        }

        if((reply == 'Y' || reply == 'y') && (age >= 12 && age < 65)){
            price -= 2.00;
        }

        System.out.println("Please pay $" + price + ". Enjoy the show!");

        keyboard.close();

        //Any && operator gets evaluated before any || operator. That's the rule in Java programming-
        //language -- evaluate && before ||
    }
}
