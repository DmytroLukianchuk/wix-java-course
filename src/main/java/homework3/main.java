package homework3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Dima");
        arrayList.add("Misha");
        CardsIterator cardsIterator = new CardsIterator(arrayList);

        System.out.println(cardsIterator.hasNext());
        System.out.println(cardsIterator.next());
        System.out.println(cardsIterator.hasNext());
        System.out.println(cardsIterator.next());
        System.out.println(cardsIterator.hasNext());
    }
}
