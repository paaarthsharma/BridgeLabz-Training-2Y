import java.util.Scanner;

public class SumNaturalNumbersComparison2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int n = scanner.nextInt();
            if (n >= 0) {
                int sumLoop = 0;
                for (int i = 1; i <= n; i++) {
                    sumLoop += i;
                }
                int sumFormula = n * (n + 1) / 2;
                System.out.println("Sum using for loop: " + sumLoop);
                System.out.println("Sum using formula: " + sumFormula);
                System.out.println("Both computations are " + (sumLoop == sumFormula ? "correct" : "not matching"));
            } else {
                System.out.println("The number " + n + " is not a natural number");
            }
        }
    }
}