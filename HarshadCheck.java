import java.util.Scanner;

public class HarshadCheck {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int number = sc.nextInt();
            int sum = 0;
            int temp = number;
            while (temp != 0) {
                sum += temp % 10;
                temp /= 10;
            }
            System.out.println(number % sum == 0 ? "Harshad Number" : "Not a Harshad Number");
        }
    }
}