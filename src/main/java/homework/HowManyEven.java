package homework;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Write a program called HowManyEven which prints how many even digits number n has (Assumption: n>0).
 * For example - per given 254698 number the program should print 4
 */

public class HowManyEven {

    public static final String STRING = "2345";

    public static ArrayList<Integer> stringToList(String string) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            result.add(Integer.parseInt(string.substring(i, i + 1)));
        }
        return result;
    }

    public static long countEvenDigits(ArrayList<Integer> list) {
        return list.stream().filter(i -> i % 2 == 0).count();
    }

    public static void main(String[] args) {
        System.out.println("The number of the even numbers in a given " + STRING + " string is: "
                + countEvenDigits(stringToList(STRING)));
    }
}
