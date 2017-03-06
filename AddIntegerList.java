import acm.program.*;

public class AddIntegerList extends ConsoleProgram {
    private static final int SENTINEL = 6;
    public void run() {
        println("This program adds a list of integers.");
        println("Enter values, one per line, using " + SENTINEL);
        println("to signal the end of the list.");
        int total = 0;
        while (true) {
            int value = readInt(" ? ");
            if (value == SENTINEL) break;
            total += value;
        }
        println("The total is " + total + ".");
    }
}
