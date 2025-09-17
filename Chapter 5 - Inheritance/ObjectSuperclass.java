import java.util.Objects;

public class ObjectSuperclass {

    private static class Employee {

        private String name;
        private double salary;

        public Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "Employee [name=" + name + ", salary=" + salary + "]";
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((name == null) ? 0 : name.hashCode());
            long temp;
            temp = Double.doubleToLongBits(salary);
            result = prime * result + (int) (temp ^ (temp >>> 32));
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Employee other = (Employee) obj;
            if (name == null) {
                if (other.name != null)
                    return false;
            } else if (!name.equals(other.name))
                return false;
            if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
                return false;
            return true;
        }

    }

    private static class Manager extends Employee {

        private double bonus;

        public Manager(String name, double salary) {
            super(name, salary);
        }

        public void setBonus(double bonus) {
            this.bonus = bonus;
        }

        @Override
        public String toString() {
            return "Manager [name=" + super.name + ", salaru=" + super.salary + ", bonus=" + bonus + "]";
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = super.hashCode();
            long temp;
            temp = Double.doubleToLongBits(bonus);
            result = prime * result + (int) (temp ^ (temp >>> 32));
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (!super.equals(obj))
                return false;
            if (getClass() != obj.getClass())
                return false;
            Manager other = (Manager) obj;
            if (Double.doubleToLongBits(bonus) != Double.doubleToLongBits(other.bonus))
                return false;
            return true;
        }

    }

    public static void main(String[] args) {
        Object objOne = new Employee("Carl Cracker", 8000.00);
        Object objTwo = new Manager("Carl Cracker", 8000.00);

        Object objTree = new Employee("Carl Cracker", 8000.00);

        // To do anything specific with the value, you need to have some knowledge about
        // the original type and apply a cast:
        Employee e = (Employee) objOne;
        Manager m = (Manager) objTwo;

        Employee eTwo = (Employee) objTree;

        System.out.println(e);
        System.out.println(m);

        System.out.println(e.equals(m));
        System.out.println(m.equals(e));
        System.out.println(e.equals(eTwo));
    }

}
