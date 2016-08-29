package interfaces;

public class Duck extends Bird implements Quackable, Swimable{

    @Override
    public void quack() {
        System.out.println("I can quack: dug-dug-dug");
    }

    @Override
    public void swim() {
        System.out.println("I can swim: swim-swim-swim");
    }
}
