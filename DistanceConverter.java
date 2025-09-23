import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        double distanceInFeet;
        Scanner input = new Scanner(System.in);
        distanceInFeet = input.nextDouble();

        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;

        System.out.printf("The distance in feet is %.2f, which is %.2f yards and %.5f miles%n",
                          distanceInFeet, distanceInYards, distanceInMiles);
    }
}