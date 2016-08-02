package homework2;

/**
 <p>
 * Write a class called Person which contains:
 * ​private instance variables: name (String), address (of the class Address you have just created), id (int), age (int)
 * One constructor to initialize all variables
 * public getters for all variables.
 * public setters for all variables except of name & id.
 * override  toString() method and returns "'name id: id address: address age: age".
 * override equals() method to check whether two persons are the same
 * Add validation to the variable on initialize & setters as follows: number should be > 0 else set default 0, String should not be empty else set value "Anonymous", note! if there is no address need to make sure it will set with default address values.
 * <p>

 */
public class Person {
    private String name;
    private Address address;
    private int id;
    private int age;

    public void setAddress(Address address) {
        if (address == null)
            this.address = new Address("Anonymous", 0, 0);
        else
            this.address = address;
    }

    public void setAge(int age) {
        if (age > 0) this.age = age;
        else this.age = 0;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public Person(String name, Address address, int id, int age) {
        if (name == null)
            this.name = "Anonymous";
        else
            this.name = name;
        if (address == null)
            this.address = new Address("Anonymous", 0, 0);
        else
            this.address = address;
        if (id < 0)
            this.id = 0;
        else
            this.id = id;
        if (age < 0)
            this.age = 0;
        else
            this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        return ((Person)obj).name.equals(name) && ((Person)obj).address.equals(address) && ((Person)obj).id == id
                && ((Person)obj).age == age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name: '" + name + '\'' +
                ", address: " + address +
                ", id: " + id +
                ", age: " + age +
                '}';
    }

}
