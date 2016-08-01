package homework2;

/**
 #2 Write a method that gets an array of digits and determines if it's a Palindrome or not.
 e.g. "abcdcba" - True; "abcdefg" - False
 */

public class PalindromeStr {

    String userData;

    @Override
    public String toString() {
        return "Is a given String = \"" + userData + "\" a Polindrome: ";
    }

    public PalindromeStr(String userData) {
        this.userData = userData;
    }

    public boolean isStringPalindrome() {
        for (int i = 0; i < this.userData.length(); i++) {
            if (!userData.substring(i, i + 1).equals(userData.substring(userData.length() - i - 1, userData.length() - i)))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        PalindromeStr palindromeStr = new PalindromeStr("abddba");
        System.out.print(palindromeStr);
        System.out.println(palindromeStr.isStringPalindrome());
    }
}
