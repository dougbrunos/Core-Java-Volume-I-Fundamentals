package interfaces;

public class Ball implements Comparable<Ball> {

    private String color;
    private int quantity;

    public Ball(String color, int quantity) {
        this.color = color;
        this.quantity = quantity;
    }

    public String getColor() {
        return color;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public int compareTo(Ball o) {
        return Integer.compare(quantity, o.quantity);
    }

    public static void main(String[] args) {
        var ballOne = new Ball("Green", 1);
        var ballTwo = new Ball("Red", 0);

        System.out.println(ballOne.compareTo(ballTwo));

        System.out.println("0 - equal, 1 - biggest, 2 - smaller");
    }

}