import java.util.Scanner;

public class MultiplesBelow100 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int number = sc.nextInt();
            if (number < 1 || number >= 100) return;
            for (int i = 100; i >= 1; i--) {
                if (i % number == 0) System.out.println(i);
            }
        }
    }
}