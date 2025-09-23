import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = sc.nextInt();

            int temp = number, count = 0;
            while (temp != 0) {
                temp /= 10;
                count++;
            }

            int[] digits = new int[count];
            for (int i = 0; i < count; i++) {
                digits[i] = number % 10;
                number /= 10;
            }

            System.out.print("Reversed digits: ");
            for (int digit : digits) {
                System.out.print(digit);
            }
        }
    }
}