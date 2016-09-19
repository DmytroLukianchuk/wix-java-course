package interfaces;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Flyable> flyable = new ArrayList<>();
        List<Quackable> quackable = new ArrayList<>();
        List<Swimable> swimable = new ArrayList<>();

        Duck duck = new Duck();
        Chicken chicken = new Chicken();
        Swan swan = new Swan();

        flyable.add(duck);
        flyable.add(chicken);
        flyable.add(swan);

        quackable.add(duck);

        swimable.add(duck);
        swimable.add(swan);

        swimable.stream()
                .forEach(Swimable::swim);

    }
}
