public class Overloading {

    public static void main(String[] args) {
        var messages = new StringBuilder();
        var todoList = new StringBuilder("To do:\n");

        /*
         * This capability is called overloading. Overloading occurs if several methods
         * have the same name (in this case, the StringBuilder constructor method) but
         * different parameters.
         */

        messages.append("Hello");
        todoList.append("Work\n");
        todoList.append("Eat");

        System.out.println(messages);
        System.out.println(todoList);

        // The process of finding a match is called overloading resolution.
    }

}
