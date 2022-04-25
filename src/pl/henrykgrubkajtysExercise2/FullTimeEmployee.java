package pl.henrykgrubkajtysExercise2;

public class FullTimeEmployee extends Employee {
    private static final double BONUS = 0.05;
    private double constantPayout;

    public FullTimeEmployee(String firstName, String lastName, double constantPayout) {
        super(firstName, lastName);
        this.constantPayout = constantPayout;
    }

    public double getConstantPayout() {
        return constantPayout;
    }

    public void setConstantPayout(double constantPayout) {
        this.constantPayout = constantPayout;
    }

    @Override
    public double monthlyPayment() {
        return constantPayout;
    }

    @Override
    public double annualPayment() {
        double yearPayment = constantPayout * YEAR;
        double yearBonus = yearPayment * BONUS;
        return yearPayment + yearBonus;
    }

}
