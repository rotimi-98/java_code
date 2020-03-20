import java.util.Scanner;

public class TicketPrice {

    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        int age;
        double price = 0.00;

        System.out.print("How old are you? ");
        age = keyboard.nextInt();

        if(age >= 12 && age < 65){
            price = 9.25;
        }
        if(age < 12 || age >= 65){
            price = 5.25;
        }

        //When you form the opposite of an existing condition, you can often follow the pattern below...
        // Change >= to <. Change < to >=. Change && to ||

        System.out.println("Please pay $" + price + ". Enjoy the show!");

        keyboard.close();
    }

}
