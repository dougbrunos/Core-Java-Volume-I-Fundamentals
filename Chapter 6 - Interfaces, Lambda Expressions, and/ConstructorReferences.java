import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ConstructorReferences {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Douglas", "John"));
        
        Stream<Person> stream = names.stream().map(Person::new);
        List<Person> people = stream.toList();

        System.out.println(people);
    }

}

class Person {

    private String name;

    public Person(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + "]";
    }

}