package AbstractClasses;

public class Teacher extends Person {

    private double salary;

    public Teacher(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public String getDescription() {
        return "a teacher has salary: " + salary;
    }

}
