package homework;
import java.util.Scanner;
import java.io.PrintWriter;

public class updated_dosage {
    public static void main(String[] args) throws Exception {

        // prompt the user for name and weight
        System.out.println("Medication Dosage Log:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the patient: ");
        String patientName = scanner.nextLine();
        System.out.print("Enter the weight of the patient in pounds: ");

        //declare variables
        int pounds = scanner.nextInt();
        final double KILOGRAMS_PER_POUND = 0.453592;
        double kilograms = pounds * KILOGRAMS_PER_POUND;

        double dosage = kilograms * 30;    

        scanner.close();

        PrintWriter pw = new PrintWriter("dosageLog.txt");
        pw.println("Patient Name: " + patientName);
        pw.println("Wight: " + pounds + " lbs");
        pw.printf("Coverted to kilos: %.2f kg%n", kilograms);
        pw.print("Required Dosage: " + dosage + " mg");

        pw.close();

    }
}