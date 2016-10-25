package homework5;

public class NegativeBalanceException extends Exception {
    NegativeBalanceException(String msg) {
        super(msg);
    }
}