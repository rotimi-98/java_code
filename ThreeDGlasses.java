import java.util.Scanner;

public class ThreeDGlasses {


    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        int age;
        double price = 0.00;
        char reply;

        System.out.println("How old are you? ");
        age = keyboard.nextInt();

        System.out.print("Have a coupon? (Y/N) ");
        reply = keyboard.findWithinHorizon(".", 0).charAt(0);

        if(age >= 12 && age < 65){
            price = 9.25;
            if(reply == 'Y' || reply == 'y'){
                price -= 2.00;
            }
        } else {
            price = 5.25;
        }

        System.out.println("Please pay $" + price + ". Enjoy the show!");

        keyboard.close();
    }

}
