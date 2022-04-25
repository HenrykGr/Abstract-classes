package pl.henrykgrubkajtysExercise2;

public class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private double numberHours;

    public PartTimeEmployee(String firstName, String lastName, double hourlyRate, double numberHours) {
        super(firstName, lastName);
        this.hourlyRate = hourlyRate;
        this.numberHours = numberHours;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getNumberHours() {
        return numberHours;
    }

    public void setNumberHours(double numberHours) {
        this.numberHours = numberHours;
    }

    @Override
    public double monthlyPayment() {
        return numberHours * hourlyRate;
    }

    @Override
    public double annualPayment() {
        return monthlyPayment() * YEAR;
    }

}
