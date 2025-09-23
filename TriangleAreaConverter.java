import java.util.Scanner;

public class TriangleAreaConverter {
    public static void main(String[] args) {
        double base, height;
        Scanner input = new Scanner(System.in);
        base = input.nextDouble();
        height = input.nextDouble();

        double areaCm2 = 0.5 * base * height;
        double areaIn2 = areaCm2 / 6.4516;

        System.out.printf("Your Height in cm is %.2f while in feet is %.2f and inches is %.2f%n",
                          height, height / 30.48, height / 2.54);
        System.out.printf("The area of the triangle is %.2f square centimeters and %.2f square inches%n",
                          areaCm2, areaIn2);
    }
}