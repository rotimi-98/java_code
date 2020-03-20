import java.util.Scanner;

public class ApproachingTrafficSignal {

    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        char greenLight;
        char intersection;
        char police;

        System.out.print("Are you approaching a green light? ");
        greenLight = keyboard.findWithinHorizon(".", 0).charAt(0);

        System.out.print("Is it safe to proceed through the intersection? ");
        intersection = keyboard.findWithinHorizon(".", 0).charAt(0);

        System.out.print("Is a police officer directing you not to proceed? ");
        police = keyboard.findWithinHorizon(".", 0).charAt(0);

        if((greenLight == 'y' || greenLight == 'Y') && (intersection == 'n' || intersection == 'N') && (police == 'y' || police == 'Y')){
            System.out.println("Stop");
        }else if((greenLight == 'y' || greenLight == 'Y') && (intersection == 'y' || intersection == 'Y') && (police == 'y' || police == 'Y')){
            System.out.println("Stop");
        }else if((greenLight == 'y' || greenLight == 'Y') && (intersection == 'y' || intersection == 'Y') && (police == 'n' || police == 'N')){
            System.out.println("Go");
        }else if((greenLight == 'y' || greenLight == 'Y') && (intersection == 'n' || intersection == 'N') && (police == 'n' || police == 'N')) {
            System.out.println("Stop");
        }

        if(greenLight == 'n' || greenLight == 'N'){
            System.out.println("Stop");

        }

        keyboard.close();
    }
}
