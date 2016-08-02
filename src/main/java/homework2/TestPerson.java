package homework2;

/**
 * Write a test program called TestPerson to test the constructor and public methods in the class Person.
 * <p>
 * <p>
 * Create 4 persons as follows:
 * person1 has the same data as person2 and no missing info.
 * person3 has no address.
 * person 4 has no name, address should be the same as person1 (duplicated)
 * Print each person's data & check within your program if:
 * person1 is equal to person2
 * person3 is equal to person1
 * address of person3 is equal to address of person2
 * address of person4 is equal to address of person1
 */
public class TestPerson {
    public static void main(String[] args) {
        Address address = new Address("Shevchenko", 35, 49000);
        Person person1 = new Person("Dima", address, 11, 27);
        Person person2 = new Person("Dima", address, 11, 27);
        Person person3 = new Person("Vova", null, 11, 27);
        Person person4 = new Person(null, address.duplicate(), 11, 27);

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);
        System.out.println();

        System.out.println("Is Person1 equal to Person2? \n" + person1.equals(person2));
        System.out.println();

        System.out.println("Is Person3 equal to Person1? \n" + person3.equals(person1));
        System.out.println();

        System.out.println("Is  Address of person3 is equal to address of person2? \n" + person3.getAddress().equals(person2.getAddress()));
        System.out.println();

        System.out.println("Is  Address of person4 is equal to address of person1? \n" + person4.getAddress().equals(person1.getAddress()));

    }
}
