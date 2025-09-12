public class MethodComments {

}
/**
* A {@code Card} object represents a playing card, such
* as "Queen of Hearts". A card has a suit (Diamond, Heart,
* Spade or Club) and a value (1 = Ace, 2 . . . 10, 11 = Jack,
* 12 = Queen, 13 = King)
*/
class Employee {

    /**
     * The "Hearts" card suit
     */
    public static final int HEARTS = 1;

    private double salary;

    /**
     * Raises the salary of an employee.
     * 
     * @param byPercent the percentage by which to raise the
     *                  salary (e.g., 10 means 10%)
     * @return the amount of the raise
     */
    public double raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
        return raise;
    }

}