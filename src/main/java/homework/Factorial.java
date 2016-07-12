package homework;

/**
 Task#1:
 By using for loop write a program called Factorial which calculates n! and prints the result.
 */
public class Factorial {

    public static int getFactorial(long n) {
        int res = 1;
        int counter = 1;

        for (int i = 1; i <= n; i++) {
            if (n == 0) {
                return res;
            } else {
                res = res * counter;
                counter++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(getFactorial(0));
    }
}
