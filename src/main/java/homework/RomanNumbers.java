package homework;

/**
 Write a method that gets a number from 1-10 and return the roman number sign
 */
public class RomanNumbers {

    public static final int NUMBER = 1;
    public final String string = "You number in roman would look like: ";
    int number;

    public RomanNumbers(int number) {
        this.number = number;
    }

    public String romanNumber() {
        String romeNumber = "";

        switch (number) {
            case 1 : romeNumber = "I";
                break;
            case 2 : romeNumber = "II";
                break;
            case 3 : romeNumber = "III";
                break;
            case 4 : romeNumber = "IV";
                break;
            case 5 : romeNumber = "V";
                break;
            case 6 : romeNumber = "VI";
                break;
            case 7 : romeNumber = "VII";
                break;
            case 8 : romeNumber = "VIII";
                break;
            case 9 : romeNumber = "IX";
                break;
            case 10 : romeNumber = "X";
                break;
        }
        return romeNumber;
    }

    @Override
    public String toString() {
        return string + "\n" + number + " - " + romanNumber();
    }

    public static void main(String[] args) {
        RomanNumbers romanNumbers = new RomanNumbers(NUMBER);
        System.out.println(romanNumbers);
    }
}

// Note to Efrat: I've been using class Constructor just for beeing able to practice toString override
