interface Payable {
    double getPaymentAmount();
}
public class Person implements Comparable<Person>, Payable {

    private int id;
    private String name;
    private String surname;

    private static int nextId = 1;

    // constructors
    public Person() {
        this.id = nextId++;
    }
    public Person(String name, String surname) {
        this();
        this.name = name;
        this.surname = surname;

    }
    // toString
    @Override
    public String toString() {

    }

    // Getters and setters
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }


    // Implementation of Payable interface method
    @Override
    public double getPaymentAmount() {
        return 0.00;
    }

    @Override
    public int compareTo(Person other) {
        return Double.compare(this.getPaymentAmount(), other.getPaymentAmount());
    }

}
