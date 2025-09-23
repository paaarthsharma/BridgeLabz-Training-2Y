import java.util.Scanner;

public class TableFromSixToNine {
    public static void main(String[] args) {
        int[] multiplicationResult = new int[4];

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = sc.nextInt();

            for (int i = 0; i < multiplicationResult.length; i++) {
                multiplicationResult[i] = number * (i + 6);
            }

            for (int i = 0; i < multiplicationResult.length; i++) {
                System.out.println(number + " * " + (i + 6) + " = " + multiplicationResult[i]);
            }
        }
    }
}