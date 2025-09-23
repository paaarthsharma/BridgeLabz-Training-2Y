import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of students: ");
            int n = sc.nextInt();

            int[][] marks = new int[n][3]; // [physics, chemistry, maths]
            double[] percentage = new double[n];
            String[] grade = new String[n];

            for (int i = 0; i < n; i++) {
                System.out.println("Enter marks for student " + (i + 1) + ":");

                for (int j = 0; j < 3; j++) {
                    String subject = j == 0 ? "Physics" : j == 1 ? "Chemistry" : "Maths";
                    System.out.print(subject + ": ");
                    int m = sc.nextInt();

                    if (m < 0) {
                        System.out.println("Invalid marks. Enter positive value.");
                        i--;
                        break;
                    }

                    marks[i][j] = m;
                }
            }

            for (int i = 0; i < n; i++) {
                int total = marks[i][0] + marks[i][1] + marks[i][2];
                percentage[i] = total / 3.0;

                if (percentage[i] >= 90) {
                    grade[i] = "A";
                } else if (percentage[i] >= 80) {
                    grade[i] = "B";
                } else if (percentage[i] >= 70) {
                    grade[i] = "C";
                } else if (percentage[i] >= 60) {
                    grade[i] = "D";
                } else {
                    grade[i] = "F";
                }
            }

            System.out.println("\nStudent Report:");
            for (int i = 0; i < n; i++) {
                System.out.println("Student " + (i + 1) +
                    ": Physics = " + marks[i][0] +
                    ", Chemistry = " + marks[i][1] +
                    ", Maths = " + marks[i][2] +
                    ", Percentage = " + String.format("%.2f", percentage[i]) +
                    "%, Grade = " + grade[i]);
            }
        }
    }
}