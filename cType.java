public class cType {

    public static void main(String args[]){

        char smallLetter, bigLetter; // This is how to store characters. A char variables only stores one character.

        smallLetter = 'b'; //In Java, every char literal starts and ends with a single quote mark.
        bigLetter = Character.toUpperCase(smallLetter); //the upper case method produces the upper case equivalent
        System.out.println(bigLetter);

        //When you surround a letter with  quote marks, you tell the computer that the letter isn't a variable name.


    }
}
