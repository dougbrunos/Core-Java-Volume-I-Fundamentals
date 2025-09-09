import java.util.Scanner;

public class BreakControlFlow {

    public static void main(String[] args) {
        int sum = 1;
        int goal = 5;

        Scanner in = new Scanner(System.in);
        while (sum < goal) {
            System.out.print("Enter a number: ");
            int n = in.nextInt();
            if (n < 0)
                continue;
            sum += n; // not executed if n < 0
            System.out.println(sum);
        }

        in.close();

    }

}
