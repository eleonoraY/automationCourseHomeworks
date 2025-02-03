package Lecture12;

public class fullTimeEmployee extends Employee{


    public fullTimeEmployee(int id, String firstName, String lastName, double baseSalary) {
        super(id, firstName, lastName, baseSalary);
    }

    @Override
    public double calcMonthlySalary() {
        return getBaseSalary();
    }
}
