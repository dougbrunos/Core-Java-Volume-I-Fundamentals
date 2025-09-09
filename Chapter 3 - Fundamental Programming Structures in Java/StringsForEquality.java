public class StringsForEquality {

    public static void main(String[] args) {
        String greeting = "Hello";
        System.out.println(greeting.equals("hello"));
        System.out.println(greeting.equalsIgnoreCase("Hello"));  
    
        // Empty String
        System.out.println(greeting.length());
        // Or 
        System.out.println(greeting.equals(""));

        System.out.println("===========");
        String str = " ";
        System.out.println(str.isBlank());
        System.out.println(str.isEmpty());
    }

}
