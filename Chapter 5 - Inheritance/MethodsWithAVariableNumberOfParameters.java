public class MethodsWithAVariableNumberOfParameters {

    public static double max(double... values) {
        double largest = Double.NEGATIVE_INFINITY;
        for (double v : values)
            if (v > largest)
                largest = v;
        return largest;
    }

    public static double min(double... values) {
        double smallest = Double.POSITIVE_INFINITY;
        for(double v : values)
            if (v < smallest)
                smallest = v;
        return smallest;
    }

    public static void main(String[] args) {
        System.out.println("Largest value: " + max(2.0, 1.0, 12.0, 3.0));
        System.out.println("Smallest value: " + min(2.0, 1.0, 12.0, 3.0, 5.0, 1, 2));
    }

}
