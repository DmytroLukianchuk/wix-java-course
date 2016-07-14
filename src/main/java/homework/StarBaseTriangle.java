package homework;

/**
 Write a program called StarBaseTriangle that displays a triangle with ‘n’ star base. for example per n=5 triangle pattern should look like:
 *
 **
 ***
 ****
 *****
 */

public class StarBaseTriangle {

    public static final String SYMBOL = "#";
    public static final int ROW = 15;

    public static void printTriangle(String symbol, int row) {
        for (int i = 0; i <= row; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
    public static void printTriangleReversed(String symbol, int row) {
        for (int i = 0; i <= row; i++) {
            for (int j = 0; j <= row - i; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printTriangle(SYMBOL, ROW);
        System.out.println();
        printTriangleReversed(SYMBOL, ROW);
    }
}
