package homework3;

import java.util.ArrayList;
import java.util.Iterator;

public class CardsIterator implements Iterator {
    ArrayList<String> cardsPack = new ArrayList<>();

    public CardsIterator(ArrayList<String> cardsPack) {
        this.cardsPack = cardsPack;
    }

    public ArrayList<String> getCardsPack() {
        return cardsPack;
    }

    public void setCardsPack(ArrayList<String> cardsPack) {
        this.cardsPack = cardsPack;
    }

    private int counter = -1;

    public String next() {
        counter++;
        return cardsPack.get(counter);
    }

    public boolean hasNext() {
        return counter < this.cardsPack.size() - 1;
    }

    public void reset() {
        counter = 0;
    }
}
