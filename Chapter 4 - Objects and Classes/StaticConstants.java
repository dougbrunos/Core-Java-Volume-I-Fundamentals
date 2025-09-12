public class StaticConstants {

    // public class Math {
    // public static final double PI = 3.14159265358979323846;
    // }

    /*
     * If the keyword static had been omitted, then PI would have been an
     * instance field of the Math class. That is, you would need an object of this
     * class to access PI, and every Math object would have its own copy of PI.
     */

    public static void main(String[] args) {

        System.out.println(Math.PI);

    }

}
