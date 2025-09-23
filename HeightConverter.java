import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
        double heightCm;
        Scanner input = new Scanner(System.in);
        heightCm = input.nextDouble();
        double totalInches = heightCm / 2.54;
        int feet = (int) (totalInches / 12);
        double inches = totalInches % 12;
        System.out.printf("Your Height in cm is %.2f while in feet is %d and inches is %.2f%n", heightCm, feet, inches);
    }
}