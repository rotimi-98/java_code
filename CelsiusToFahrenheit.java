import java.util.Scanner;

public class CelsiusToFahrenheit {

    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        double celsius, fahrenheit;

        System.out.print("Enter the Celsius temperature: ");
        celsius = keyboard.nextDouble();

        fahrenheit = 9.0 /5.0 * celsius + 32.0;

    //    System.out.println(fahrenheit);

        System.out.print("Room temperature? ");
    //    System.out.println(fahrenheit == 69.8);
        System.out.println(fahrenheit >= 69.8 - 0.01 && fahrenheit <= 69.8 + 0.01);

        keyboard.close();
    }
}
