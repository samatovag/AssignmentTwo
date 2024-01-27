public class Student extends Person {
    private double gpa;

    // constructors
    public Student() {
        super();
    }

    public Student(String name, String surname, double gpa) {
        super(name, surname);
        this.gpa = gpa;
    }

    // toString method
    @Override
    public String toString() {
        return "Student: " + super.toString();
    }

    // getters, setters
    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    // implementation of Payable interface method
    @Override
    public double getPaymentAmount() {
        // The stipend is given in case student is having gpa > 2.67 and it is
        //constant
        return (gpa > 2.67) ? 36660.00 : 0.0;
    }
    // Implementation of Comparable interface method
    @Override
    public int compareTo(Person otherPerson) {
        // comparison based on payment amount
        if (otherPerson instanceof Student) {
            return Double.compare(this.getPaymentAmount(), otherPerson.getPaymentAmount());
        } else {
            return 1;
        }
    }

}
