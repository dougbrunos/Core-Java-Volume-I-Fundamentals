import java.util.ArrayList;

public class ArrayListTest {

    public static void main(String[] args) {
        var staff = new ArrayList<Employee>();

        staff.add(new Employee(
                "Harry Hacker",
                10000.00,
                2020,
                01,
                02));

        System.out.println(staff.size());

        Employee e = (Employee) staff.get(0);
        System.out.println(e.getId());

        for (Employee employee : staff) {
            System.out.println(employee.getName());
        }

    }

}
