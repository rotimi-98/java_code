import java.util.Scanner;

public class ApproachingTrafficSignalUpdated {

    enum Color{green, yellow, red}

    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        char signal;
        Color colour;
        char proceed;
        char officer;

        System.out.print("What colour is the traffic light? (G/Y/R): ");
        signal = Character.toUpperCase(keyboard.findWithinHorizon(".", 0).charAt(0));

        System.out.print("Is it safe to proceed through the intersection? ");
        proceed = Character.toUpperCase(keyboard.findWithinHorizon(".", 0).charAt(0));

        System.out.print("Is a police officer directing you not to proceed? ");
        officer = Character.toUpperCase(keyboard.findWithinHorizon(".", 0).charAt(0));

        if(signal == 'G'){
            colour = Color.green;
            System.out.println("Green");
        }else if(signal == 'Y'){
            colour = Color.yellow;
            System.out.println("Yellow");
        }else if(signal == 'R'){
            colour = Color.red;
            System.out.println("Red");
        }

        if((signal == 'Y' || signal == 'R')  && (proceed == 'N' || officer == 'Y')){
            System.out.println("Stop");
        }
//        else if((greenLight == 'y' || greenLight == 'Y') && (intersection == 'y' || intersection == 'Y') && (police == 'y' || police == 'Y')){
//            System.out.println("Stop");
//        }else if((greenLight == 'y' || greenLight == 'Y') && (intersection == 'y' || intersection == 'Y') && (police == 'n' || police == 'N')){
//            System.out.println("Go");
//        }else if((greenLight == 'y' || greenLight == 'Y') && (intersection == 'n' || intersection == 'N') && (police == 'n' || police == 'N')) {
//            System.out.println("Stop");
//        }
//
//        if(greenLight == 'n' || greenLight == 'N'){
//            System.out.println("Stop");
//
//        }













    }

}
