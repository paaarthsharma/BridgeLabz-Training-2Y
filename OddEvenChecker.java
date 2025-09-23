import java.util.Scanner;

public class OddEvenChecker {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int number = sc.nextInt();
            if (number < 1) return;
            for (int i = 1; i <= number; i++) {
                System.out.println(i + " is " + (i % 2 == 0 ? "even" : "odd"));
            }
        }
    }
}
