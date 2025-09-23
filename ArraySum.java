import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        double[] values = new double[10];
        double total = 0.0;
        int index = 0;

        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                System.out.print("Enter a number: ");
                double input = sc.nextDouble();

                if (input <= 0 || index == values.length) break;

                values[index++] = input;
            }
        }

        for (int i = 0; i < index; i++) {
            total += values[i];
            System.out.println("Value " + (i + 1) + ": " + values[i]);
        }

        System.out.println("Total sum: " + total);
    }
}