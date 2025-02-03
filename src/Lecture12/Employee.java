package Lecture12;

public abstract class Employee {
    public int id;
    public String firstName;
    public String lastName;
    public double baseSalary;

    public Employee(int id, String firstName, String lastName, double baseSalary){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.baseSalary = baseSalary;
    }

    public Employee(int id, String firstName, String lastName){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getName(){
        return firstName + " " + lastName;
    }

    protected double getBaseSalary(){
        return baseSalary;
    }

    public abstract double calcMonthlySalary();



    public double getAnnualSalary(){
        return baseSalary * 12;
    }

    public double raiseSalary(double percentage) {
        if (percentage > 0) {
            baseSalary += baseSalary * (percentage / 100);
        }
        return baseSalary;
    }

    public String toString(){
        return "Employee id: " + id + "\nName: " + getName() + "\nMonthly salary: " + baseSalary + "\nAnnual salary: " + getAnnualSalary();
    }
}
