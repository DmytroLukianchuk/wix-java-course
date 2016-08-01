package homework2;

import java.util.ArrayList;
import java.util.Objects;

/**
 #1 Write a method that gets an array of digits and determines if it's a Palindrome or not.
 e.g. "12321" - True; "12345" - False
 */

public class Palindrome {

    public Palindrome(ArrayList<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    ArrayList<Integer> arrayList;


    @Override
    public String toString() {
        return "Is a given arrayList = " + arrayList +
                " a Polindrome: ";
    }

    public boolean isArrayPalindrome()  {
        for (int i = 0; i < (this.arrayList.size() - 1) / 2; i++) {
            if (this.arrayList.size() % 2 == 0)
                return false;
            if (!Objects.equals(this.arrayList.get(i), this.arrayList.get(this.arrayList.size() - 1 - i))) {
                return false;
            }
        }
        return true;
    }

    public static ArrayList<Integer> fillArrayByInt(int number) {
        String s = Integer.toString(number);
        ArrayList<Integer> inputData = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            inputData.add(Integer.parseInt(s.substring(i, i + 1)));
        }
        return inputData;
    }

    public static void main(String[] args) {
        ArrayList<Integer> inputData = fillArrayByInt(12321);

        Palindrome palindrome = new Palindrome(inputData);

        System.out.print(palindrome);
        System.out.println(palindrome.isArrayPalindrome());
    }
}
