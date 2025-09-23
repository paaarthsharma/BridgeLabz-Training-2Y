import java.util.Scanner;

public class OddEvenPrinter {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            if (number >= 1) {
                for (int i = 1; i <= number; i++) {
                    System.out.println(i + " is " + (i % 2 == 0 ? "even" : "odd") + " number");
                }
            } else {
                System.out.println("The number " + number + " is not a natural number");
            }
        }
    }
}