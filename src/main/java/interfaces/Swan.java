package interfaces;

public class Swan extends Bird implements Swimable {

    @Override
    public void swim() {
        System.out.println("I can swim: swim-swan");
    }
}
