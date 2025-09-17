package AbstractClasses;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        
        var people = new ArrayList<Person>();

        // Error, Abstract classes cannot be instantiated.
        // Person person = new Person("Vince Vu");

        var student = new Student("Douglas", "Software Engineering");
        var teacher = new Teacher("John", 10000);

        people.add(student);
        people.add(teacher);

        for(Person p : people)
           System.out.println(p.getName() + ", " + p.getDescription());

    }

}
