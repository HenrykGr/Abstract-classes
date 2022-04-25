package pl.henrykgrubkajtysExercise2;

import com.sun.source.tree.BreakTree;

public class AllEmployess {
    private static final int MAX_EMPLOYEE = 4;
    Employee[] employees = new Employee[MAX_EMPLOYEE];
    private int employeesNumber = 0;

    public void addEmployee(Employee employee) {
        if (employeesNumber < MAX_EMPLOYEE) {
            employees[employeesNumber] = employee;
            employeesNumber++;
        }
    }

    public double totalMonthlySalarys(Employee[] employess) {
        double total = 0;
        for (Employee employee : employees) {
            total += employee.monthlyPayment();
        }
        return total;
    }

    public double totalAnnualSalarys(Employee[] employess) {
        double total = 0;
        for (Employee employee : employees) {
            total += employee.annualPayment();
        }
        return total;
    }

    public void printInfo(Employee[] employees) {
        System.out.println("Pracownicy: ");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
