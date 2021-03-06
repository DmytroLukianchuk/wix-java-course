package homework2;

/**
 * I am a Person!
 * <p>
 * ​ Nice to meet you..​
 * Write a class called Address which contains:
 * private instance variables: street (String), city (String), houseNumber (int), state (String), zipCode (int)
 * One constructor to initialize all variables
 * public getters/setters for all variables
 * override toString() method and return "houseNumber street st., city, state", e.g., "23 Nen Yehuda st., Tel Aviv, Israel".
 * override equals() method to check whether two addresses are the same
 * <p>
 * implement duplicate() method which create new address with the same address info and return it
 * <p>
 * Add validation to the variable on initialize & setters as follows: number should be > 0 else set default 0, String should not be empty else set value "Unknown"
 *
 */
public class Address {
    private String street;
    private int houseNumber;
    private int zipCode;

    public Address(String street, int houseNumber, int zipCode) {
        if (street == null)
            this.street = "Unknown";
        else
            this.street = street;
        if (zipCode < 0)
            this.zipCode = 0;
        else
            this.zipCode = zipCode;
        if (houseNumber < 0)
            this.houseNumber = 0;
        else
            this.houseNumber = houseNumber;
    }

    public void setStreet(String street) {
        if (street == null)
            this.street = "Unknown";
        else this.street = street;
    }

    public void setHouseNumber(int houseNumber) {
        if (houseNumber < 0)
            this.houseNumber = 0;
        else
            this.houseNumber = houseNumber;
    }

    public void setZipCode(int zipCode) {
        if (zipCode < 0)
            this.zipCode = 0;
        else
            this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public int getZipCode() {
        return zipCode;
    }

    public Address duplicate() {
        return new Address(this.street, this.houseNumber, this.zipCode);
    }

    @Override
    public String toString() {
        return houseNumber + " " +
                street + " st., " +
                zipCode;
    }

    @Override
    public boolean equals(Object obj) {
        return ((Address) obj).street.equals(street) && ((Address) obj).houseNumber == houseNumber && ((Address) obj).zipCode == zipCode;
    }


}
