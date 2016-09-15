package errorhandling;

/**
 Error Handling

 Write a method “formatStrArrToIntArr”
 This method will get Array of 3 numbers in string format and will return an  Array of the 3 numbers in an Int format.
 Write a program that will use this method on various inputs:
 Array of 3 numbers as String
 Array of 3 non-numbers strings
 Null Array
 Array of 2 numbers as String

 Make sure to add treatment to each of the relevant exception by  printing appropriate and clear message to screen.

 */
public class ErrorHandling {
    public static int[] formatStrArrToIntArr(String strOne, String strTwo, String strThree) {

        return new int[]{Integer.parseInt(strOne), Integer.parseInt(strTwo), Integer.parseInt(strThree)};
    }

    public static void printArr(int[] arr) {
        for (int anArr : arr) {
            System.out.print(anArr + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Array of 3 numbers as String
        System.out.println("Trying to print your array out: ");
        printArr(formatStrArrToIntArr("1", "2", "3"));

        // Array of 3 non-numbers strings
        System.out.println();
        System.out.println("Trying to print your array out: ");
        try {
            printArr(formatStrArrToIntArr("a", "b", "c"));
        }catch (NumberFormatException e) {
            System.out.println("ERROR. Sorry, you entered NOT NUMBERS or NULL strings");
        }

        // Null Array
        System.out.println();
        System.out.println("Trying to print your array out: ");
        try {
            printArr(formatStrArrToIntArr(null, null, null));
        } catch (NumberFormatException e) {
            System.out.println("ERROR. Sorry, you entered NOT NUMBERS or NULL strings");
        }

        // Array of 2 numbers as String
        System.out.println();
        System.out.println("Trying to print your array out: ");
        try {
//ToDo            printArr(formatStrArrToIntArr("1", "2"));
        } catch (NumberFormatException e) {
            System.out.println("ERROR. Sorry, you entered NOT NUMBERS or NULL strings");
        }
    }
}


