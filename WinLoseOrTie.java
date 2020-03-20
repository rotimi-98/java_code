import java.util.Scanner;

public class WinLoseOrTie {

    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        int hankees, socks;

        System.out.print("Hankees and Socks scores? ");
        hankees = keyboard.nextInt();
        socks = keyboard.nextInt();
        System.out.println();

        if(hankees > socks){
            System.out.println("Hankees win...");
            System.out.print("Hankees: ");
            System.out.println(hankees);
            System.out.print("Socks: ");
            System.out.println(socks);
        } else if(socks > hankees){
            System.out.println("Socks win...");
            System.out.print("Socks:   ");
            System.out.println(socks);
            System.out.print("Hankees: ");
            System.out.println(hankees);
        }else{
            System.out.println("It's a tie...");
            System.out.print("Hankees: ");
            System.out.println(hankees);
            System.out.print("Socks:   ");
            System.out.println(socks);
        }

        keyboard.close();



    }
}
