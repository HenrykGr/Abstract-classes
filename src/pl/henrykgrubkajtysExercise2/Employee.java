package pl.henrykgrubkajtysExercise2;

abstract public class Employee {
    public static final int YEAR = 12;
    private String firstName;
    private String lastName;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName
                + ", wypłata miesięczna: " + monthlyPayment() +
                ", wypłata roczna: " + annualPayment();
    }

    public abstract double annualPayment();

    public abstract double monthlyPayment();

}
