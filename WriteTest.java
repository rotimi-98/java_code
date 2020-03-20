import java.io.FileNotFoundException;
import java.io.PrintStream;

public class WriteTest {

    public static void main(String args[]) throws FileNotFoundException {

        PrintStream diskWriter = new PrintStream("cookedlocal.txt");
        diskWriter.println(100.50);

        diskWriter.close();
    }
}
