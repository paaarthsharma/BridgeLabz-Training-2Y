import java.util.Scanner;

public class RocketLaunchCountdown2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter countdown start value: ");
            int counter = scanner.nextInt();
            for (int i = counter; i >= 1; i--) {
                System.out.println(i);
            }
            System.out.println("Lift off!");
        }
    }
}
