package homework;

/**
 Write a program called SquareBoard that displays the following n×n (n=5) pattern using two nested for loops.
 Your program should use only two output statements,one EACH of the followings:
 System.out.print("# "); // print # and a space, without newline
 System.out.println(); // print a newline

 Output should look like:
 # # # # #
 # # # # #
 # # # # #
 # # # # #
 # # # # # */

public class SquareBoard {

    public static final String SYMBOL = "#";
    public static final int SIZE = 10;

    public static void printSquareBoard(String symbol, int size) {
        for (int i = 0; i < size; i ++) {
            for (int j = 0; j < size; j ++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printSquareBoard(SYMBOL, SIZE);
    }
}
