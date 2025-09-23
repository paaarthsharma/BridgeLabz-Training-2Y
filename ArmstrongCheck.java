import java.util.Scanner;

public class ArmstrongCheck {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int number = sc.nextInt();
            int sum = 0;
            int originalNumber = number;
            while (originalNumber != 0) {
                int digit = originalNumber % 10;
                sum += digit * digit * digit;
                originalNumber /= 10;
            }
            System.out.println(sum == number ? "Armstrong Number" : "Not an Armstrong Number");
        }
    }
}