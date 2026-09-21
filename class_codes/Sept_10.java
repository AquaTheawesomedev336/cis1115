package class_codes;
import java.util.Scanner;

public class Sept_10 {
    public static void main(String[] args) {
        // Read in city1, city2, distance, cost from standard input
        Scanner scanner = new Scanner(System.in);

        // Declare variables
        String city1, city2;
        int distance;
        double costPerMile;

        // Prompt for city1
        System.out.print("Enter Starting city: ");
        city1 = scanner.next();

        // Prompt for city2
        System.out.print("Enter Ending city: ");
        city2 = scanner.next();

        // Prompt for distance
        System.out.print("Enter distance (in miles) between cities: ");
        distance = scanner.nextInt();

        // Prompt for cost per mile
        System.out.print("Enter cost per mile: ");
        costPerMile = scanner.nextDouble();

        // Calculate cost of travel
        double total = distance * costPerMile;
        System.out.println("Total: " + total);
        System.out.printf("The cost of travelling from %s to %s is $%.2f%n", city1, city2, total);

        scanner.close();
    }
}