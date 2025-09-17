package classes;

import java.util.Random;

public class ClassTest {

    public static void main(String[] args) {
        var generator = new Random();
        var cl = generator.getClass();
        String name = cl.getName(); // name is set to

        var cl1 = Random.class; // if you import java.util.*;
        var cl2 = int.class;
        var cl3 = Double[].class;

        System.out.println(name);

        System.out.println(cl1);
        System.out.println(cl2);
        System.out.println(cl3);

        if(generator.getClass() == Random.class)
            System.out.println("Same class");
    }

}
