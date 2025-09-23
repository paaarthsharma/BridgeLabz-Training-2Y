import java.util.Scanner;

public class FriendsStats {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int ageAmar = sc.nextInt();
            double heightAmar = sc.nextDouble();
            int ageAkbar = sc.nextInt();
            double heightAkbar = sc.nextDouble();
            int ageAnthony = sc.nextInt();
            double heightAnthony = sc.nextDouble();

            String youngest = ageAmar < ageAkbar && ageAmar < ageAnthony ? "Amar" :
                              ageAkbar < ageAnthony ? "Akbar" : "Anthony";

            String tallest = heightAmar > heightAkbar && heightAmar > heightAnthony ? "Amar" :
                             heightAkbar > heightAnthony ? "Akbar" : "Anthony";

            System.out.println("Youngest: " + youngest);
            System.out.println("Tallest: " + tallest);
        }
    }
}