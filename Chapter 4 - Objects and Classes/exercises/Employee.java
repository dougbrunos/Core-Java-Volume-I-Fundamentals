package exercises;

import java.time.LocalDate;

public class Employee {

    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, LocalDate hireDay) {
        this.name = name;
        this.salary = salary;
        this.hireDay = hireDay;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double byPercent) {
        salary += salary * (byPercent / 100);
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", salary=" + salary + ", hireDay=" + hireDay + "]";
    }

    public static void main(String[] args) {
        var employeeOne = new Employee("Douglas", 10000, LocalDate.now());
        var employeeTwo = new Employee("John", 5000, LocalDate.now());

        System.out.println("Before");
        System.out.println(employeeOne);
        System.out.println(employeeTwo);

        employeeOne.raiseSalary(10);
        employeeTwo.raiseSalary(10);

        System.out.println("After");
        System.out.println(employeeOne);
        System.out.println(employeeTwo);
    }

}