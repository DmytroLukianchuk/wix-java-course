package interfaces;

/**
 * Dug, Swan, Chicken
 * Dug - flight, quack, swim
 * Swam - flight, swim
 * Chicken - flight
 */
interface Flyable {
    default void fly() {
        System.out.println("default fly");
    }
}
