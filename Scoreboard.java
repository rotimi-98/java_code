import java.util.Scanner;

public class Scoreboard {

    enum WhoWins{home, visitor, neither}

    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        int hankees, socks;
        WhoWins who;

        System.out.print("Hankees and Socks scores?   ");
        hankees = keyboard.nextInt();
        socks = keyboard.nextInt();
        System.out.println();

        if(hankees > socks){
            who = WhoWins.home;
            System.out.println("The Hankees win :-)");
        }else if(socks > hankees){
            who = WhoWins.visitor;
            System.out.println("The Socks win :-(");
        }else{
            who = WhoWins.neither;
            System.out.println("It's a tie :-|");
        }

        System.out.println();
        System.out.println("Today's game is brought to you by");
        System.out.println("SnitSoft, the number one software");
        System.out.println("vendor in the Hankeesville area.");
        System.out.println("SnitSoft is featured proudly in");
        System.out.println("Chapter 6. And remember, four out");
        System.out.println("of five doctors recommend");
        System.out.println("SnitSoft to their patients.");
        System.out.println();

        if(who == WhoWins.home){
            System.out.println("We beat 'em good. Didn't we?");
        }

        if(who == WhoWins.visitor){
            System.out.println("The umpire made an unfair call.");
        }

        if(who == WhoWins.neither){
            System.out.println("The game goes into overtime.");
        }

        keyboard.close();

    }
}
