public class CodePointsAndCodeUnits {

    public static void main(String[] args) {
        String greeting = "Hello";
        int n = greeting.length(); // is 5
        int cpCount = greeting.codePointCount(0, greeting.length());
        System.out.println(n);
        System.out.println(cpCount);

        char first = greeting.charAt(0); // first is 'H'
        char last = greeting.charAt(4); // last is 'o'
        System.out.println(first);
        System.out.println(last);
        
    }

}
