public class Casting {

    public static void main(String[] args) {
        double x = 3.405;
        int nx = (int) x;
        System.out.println(x);
        System.out.println(nx);

        // construct a Manager object
        var boss = new Manager("Carl Cracker", 80000, 1987,
                12, 15);

        var staff = new Employee[3];

        staff[0] = boss;
        staff[1] = new Employee("Harry Hacker", 50000, 1989,
                10, 1);
        staff[2] = new Employee("Tommy Tester", 40000, 1990,
                3, 15);

        for (int i = 0; i < staff.length; i++) {
            if (staff[i] instanceof Manager) {
                boss = (Manager) staff[i];
                boss.setBonus(5000);
            }
            /*
             * Easier Way
             * if (staff[i] instanceof Manager boss)
             * {
             * boss.setBonus(5000);
             * }
             */
        }

        for (Employee e : staff)
            System.out.println("name=" + e.getName() +
                    ",salary=" + e.getSalary());

    }

}