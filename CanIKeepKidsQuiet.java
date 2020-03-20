public class CanIKeepKidsQuiet {

    public static void main(String args[]){
        int gumBalls, kids, gumballsPerKid;
        boolean eachKidGetsTen;

        gumBalls = 140;
        kids = 15;
        gumballsPerKid = gumBalls / kids;

        System.out.print("True or False? ");
        System.out.println("Each kids gets 10 gumballs. ");
        eachKidGetsTen = gumballsPerKid >= 10;
        System.out.println(eachKidGetsTen);
    }
}
