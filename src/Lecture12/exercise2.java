package Lecture12;

public class exercise2 {
    public static void main(String[] args) {
     //   Employee employee1 = new Employee(1, "Eleonora", "Mihova", 2000);
    //    employee1.raiseSalary(10);
     //   System.out.println(employee1);

    //    Employee employee2 = new Employee(2, "Stanimira", "Yovcheva", 4000);
     //   System.out.println(employee2);

        fullTimeEmployee fullTimeEmployee = new fullTimeEmployee(3, "Ivan", "Ivanov", 3000);
        partTimeEmployee partTimeEmployee = new partTimeEmployee(4, "Peter", "Petrov", 20, 5);

        System.out.println("This is " + fullTimeEmployee.getName() + " and his monthly salary is: " + fullTimeEmployee.calcMonthlySalary());
        System.out.println("This is " + partTimeEmployee.getName() + " and his monthly salary is: " + partTimeEmployee.calcMonthlySalary());

    }
}
