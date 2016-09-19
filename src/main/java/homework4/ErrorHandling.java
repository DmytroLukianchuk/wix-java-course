package homework4;

/**
 * Error Handling
 * <p>
 * Write a method “formatStrArrToIntArr”
 * This method will get Array of 3 numbers in string format and will return an  Array of the 3 numbers in an Int format.
 * Write a program that will use this method on various inputs:
 * Array of 3 numbers as String
 * Array of 3 non-numbers strings
 * Null Array
 * Array of 2 numbers as String
 * <p>
 * Make sure to add treatment to each of the relevant exception by  printing appropriate and clear message to screen.
 */
public class ErrorHandling {
    String[] args;

    public ErrorHandling(String[] args) {
        this.args = args;
    }

    public int[] formatStrArrToIntArr(String[] args) {
        int result[] = new int[3];

        if (args == null) {
            throw new NullPointerException("ERROR! args == NULL!");
        }
        if (args.length != 3) {
            throw new IllegalArgumentException("ERROR! Args != THREE");
        }

        for (int i = 0; i < args.length; i++) {
            result[i] = Integer.parseInt(args[i]);
        }

        return result;
    }

    public static void printArr(int[] arr) {
        for (int anArr : arr) {
            System.out.print(anArr + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String[] valid = {"1", "2", "3"};
        String[] invalidStr = {"a", "b", "c"};
        String[] invalidNull = null;
        String[] invalidTwo = {"1", "2"};

        ErrorHandling parseValid = new ErrorHandling(valid);
        ErrorHandling parseInvalidStr = new ErrorHandling(invalidStr);
        ErrorHandling parseInvalidNull = new ErrorHandling(invalidNull);
        ErrorHandling parseInvalidTwo = new ErrorHandling(invalidTwo);

        try {
            System.out.println("Case#1: Array of 3 numbers as String");
            printArr(parseValid.formatStrArrToIntArr(valid));
            System.out.println();
        } catch (Exception e) {
            System.out.println("EXCEPTION: " + e.getMessage());
        }

        try {
            System.out.println("Case#2: Array of 3 non-numbers strings");
            printArr(parseInvalidStr.formatStrArrToIntArr(invalidStr));
            System.out.println();
        } catch (Exception e) {
            System.out.println("EXCEPTION: " + e.getMessage());
            System.out.println();
        }

        try {
            System.out.println("Case#3: Null Array");
            printArr(parseInvalidNull.formatStrArrToIntArr(invalidNull));
            System.out.println();
        } catch (Exception e) {
            System.out.println("EXCEPTION: " + e.getMessage());
            System.out.println();
        }

        try {
            System.out.println("Case#4: Array of 2 numbers as String");
            printArr(parseInvalidTwo.formatStrArrToIntArr(invalidTwo));
            System.out.println();
        } catch (Exception e) {
            System.out.println("EXCEPTION: " + e.getMessage());
        }
    }
}


