import acm.program.*;

public class Average2Integers extends ConsoleProgram {
    public void run() {
        println("This program averages two numbers.");
        int n1 = readInt("Enter n1: ");
        int n2 = readInt("Enter n2: ");
        double avg = (double)(n1 + n2)/2;
        println("The average is " + avg + ".");
    }
}
