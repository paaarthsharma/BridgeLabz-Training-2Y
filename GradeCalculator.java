import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int physics = sc.nextInt();
            int chemistry = sc.nextInt();
            int maths = sc.nextInt();

            int total = physics + chemistry + maths;
            double percentage = total / 3.0;

            System.out.println("Average Mark: " + percentage);

            if (percentage >= 90) System.out.println("Grade: A+ | Remarks: Excellent");
            else if (percentage >= 80) System.out.println("Grade: A | Remarks: Very Good");
            else if (percentage >= 70) System.out.println("Grade: B | Remarks: Good");
            else if (percentage >= 60) System.out.println("Grade: C | Remarks: Satisfactory");
            else if (percentage >= 50) System.out.println("Grade: D | Remarks: Needs Improvement");
            else System.out.println("Grade: F | Remarks: Fail");
        }
    }
}