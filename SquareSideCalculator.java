import java.util.Scanner;

public class SquareSideCalculator {
    public static void main(String[] args) {
        double perimeter;
        Scanner input = new Scanner(System.in);
        perimeter = input.nextDouble();
        double side = perimeter / 4;
        System.out.printf("The length of the side is %.2f whose perimeter is %.2f%n", side, perimeter);
    }
}