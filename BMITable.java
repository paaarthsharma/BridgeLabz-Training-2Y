import java.util.Scanner;

public class BMITable {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of persons: ");
            int n = sc.nextInt();

            double[][] personData = new double[n][3]; // [weight, height, BMI]
            String[] weightStatus = new String[n];

            for (int i = 0; i < n; i++) {
                double weight, height;

                while (true) {
                    System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
                    weight = sc.nextDouble();
                    if (weight > 0) break;
                    System.out.println("Invalid weight. Enter a positive value.");
                }

                while (true) {
                    System.out.print("Enter height (m) of person " + (i + 1) + ": ");
                    height = sc.nextDouble();
                    if (height > 0) break;
                    System.out.println("Invalid height. Enter a positive value.");
                }

                double bmi = weight / (height * height);

                personData[i][0] = weight;
                personData[i][1] = height;
                personData[i][2] = bmi;

                if (bmi < 18.5) {
                    weightStatus[i] = "Underweight";
                } else if (bmi < 25) {
                    weightStatus[i] = "Normal weight";
                } else if (bmi < 30) {
                    weightStatus[i] = "Overweight";
                } else {
                    weightStatus[i] = "Obese";
                }
            }

            System.out.println("\nBMI Report:");
            for (int i = 0; i < n; i++) {
                System.out.println("Person " + (i + 1) +
                    ": Height = " + personData[i][1] +
                    " m, Weight = " + personData[i][0] +
                    " kg, BMI = " + String.format("%.2f", personData[i][2]) +
                    ", Status = " + weightStatus[i]);
            }
        }
    }
}