import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double total = 0.0;
            double number = -1.0;
            while (number != 0.0) {
                System.out.print("Enter a number (0 to stop): ");
                number = scanner.nextDouble();
                total += number;
            }
            System.out.println("Total sum is " + total);
        }
    }
}
