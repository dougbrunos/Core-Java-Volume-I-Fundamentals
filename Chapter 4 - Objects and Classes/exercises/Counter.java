package exercises;

public class Counter {

    private int id;

    private static int nextId = 1;

    public Counter(int id) {
        this.id = id;
        nextId++;
    }

    public int getId() {
        return id;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void main(String[] args) {
        var counterOne = new Counter(getNextId());
        var counterTwo = new Counter(getNextId());
        var counterTree = new Counter(getNextId());

        System.out.println(counterOne.getId());
        System.out.println(counterTwo.getId());
        System.out.println(counterTree.getId());

    }

}