import java.util.Scanner;

public class ZaraBonus {
    public static void main(String[] args) {
        double[] salary = new double[10];
        double[] service = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];
        double totalBonus = 0.0, totalOld = 0.0, totalNew = 0.0;

        try (Scanner sc = new Scanner(System.in)) {
            for (int i = 0; i < 10; i++) {
                System.out.print("Enter salary of employee " + (i + 1) + ": ");
                double s = sc.nextDouble();
                System.out.print("Enter years of service: ");
                double y = sc.nextDouble();

                if (s <= 0 || y < 0) {
                    System.out.println("Invalid input. Try again.");
                    i--;
                    continue;
                }

                salary[i] = s;
                service[i] = y;
            }
        }

        for (int i = 0; i < 10; i++) {
            double rate = service[i] > 5 ? 0.05 : 0.02;
            bonus[i] = salary[i] * rate;
            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
            totalOld += salary[i];
            totalNew += newSalary[i];
        }

        System.out.println("Total bonus payout: " + totalBonus);
        System.out.println("Total old salary: " + totalOld);
        System.out.println("Total new salary: " + totalNew);
    }
}