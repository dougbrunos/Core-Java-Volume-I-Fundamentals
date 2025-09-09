public class Arrays {

    public static void main(String[] args) {
        // Declaring Array
        int[] a = new int[10]; // int[] a

        // shortcut for creating an array object and supplying initial values:
        int[] smallPrimes = { 2, 3, 5, 7, 11, 13 };

        String[] authors = {
                "James Gosling",
                "Bill Joy",
                "Guy Steele",
        };

        for (String author : authors) {
            System.out.println(author);
        }

    }

}
