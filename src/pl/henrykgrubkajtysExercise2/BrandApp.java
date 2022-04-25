package pl.henrykgrubkajtysExercise2;

public class BrandApp {
    public static void main(String[] args) {
        AllEmployess employer = new AllEmployess();
        employer.addEmployee(new PartTimeEmployee("Marta", "Nowak", 20, 40));
        employer.addEmployee(new PartTimeEmployee("Michał", "Siwakowski", 18, 50));
        employer.addEmployee(new FullTimeEmployee("Adam", "Kowalski", 3000));
        employer.addEmployee(new FullTimeEmployee("Jula", "Adamska", 2300));

        employer.printInfo(employer.employees);
        System.out.println("Suma rocznych wynagrodzeń: " + employer.totalAnnualSalarys(employer.employees));
        System.out.println("Suma miesięcznych wynagrodzeń: " + employer.totalMonthlySalarys(employer.employees));
    }
}
