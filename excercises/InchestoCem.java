package excercises;
import java.util.Scanner;

public class InchestoCem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     
        System.out.print("Enter number of inches: ");
        int inches = scanner.nextInt();
        final double CM_PER_INCH = 2.54; // final -> cannot be reassigned once it has been intialized
        double centimeters = inches * CM_PER_INCH;

        System.out.println(inches + " " + "inches is equal to: " + centimeters + " " + "centimeters.");
        
        scanner.close();
    }
}

