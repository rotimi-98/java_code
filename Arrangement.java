import java.util.Scanner;

public class Arrangement {

    public static void main(String args[]){

        Scanner keyboard = new Scanner(System.in);
        char x1, x2, x3;

        x1 = (keyboard.findWithinHorizon(".", 0).charAt(0));
        x2 = (keyboard.findWithinHorizon(".", 0).charAt(0));
        x3 = (keyboard.findWithinHorizon(".", 0).charAt(0));

        System.out.print(x1);
        System.out.print(x2);
        System.out.print(x3);
        System.out.println("");
        System.out.print(x1);
        System.out.print(x3);
        System.out.print(x2);
        System.out.println("");
        System.out.print(x2);
        System.out.print(x1);
        System.out.print(x3);
        System.out.println("");
        System.out.print(x2);
        System.out.print(x3);
        System.out.print(x1);
        System.out.println("");
        System.out.print(x3);
        System.out.print(x1);
        System.out.print(x2);
        System.out.println("");
        System.out.print(x3);
        System.out.print(x2);
        System.out.print(x1);
        System.out.println("");
    }
}
