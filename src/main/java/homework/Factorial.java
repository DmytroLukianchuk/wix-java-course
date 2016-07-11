package homework;

/**
 * Created by dmytrol on 7/11/16.
 */
public class Factorial {
    public Factorial(long n) {
        this.n = n;
    }

    long n;
    int res = 1;
    int counter = 1;


    public int getFactorial() {
        for (int i = 1; i <= this.n; i++) {
            if (this.n == 0) {
                return res;
            } else {
                res = res * counter;
                counter++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Factorial example = new Factorial(0);
        System.out.println(example.getFactorial());
    }
}
