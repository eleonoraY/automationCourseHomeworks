package Lecture12;

public class partTimeEmployee extends Employee{
    public int hoursWorked;
    public int hourlyRate;

    public partTimeEmployee(int id, String firstName, String lastName, int hoursWorked, int hourlyRate){
        super(id, firstName, lastName);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calcMonthlySalary() {
        return baseSalary = hoursWorked * hourlyRate;
    }
}
