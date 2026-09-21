package homework;

public class CISC_HW1 {
    public static void main(String[] args) {
        System.out.println("Medical Dosage Log:\n");

        //declare varibles
        String patientName = "Joe";
        double weight = 140;
        double kilograms = weight * 0.45359237; //pound to kilo conversion
        double dosage = kilograms * 30;
        
        //print patient information
        System.out.printf("Patient 1: %s%n Weight: %.2f%n Converted to Kilos: %.2f%n Required dosage: %.2f%n", patientName, weight, kilograms, dosage);

        String patientName2 = "Henry";
        double weight2 = 100;
        double kilograms2 = weight2 * 0.45359237;
        double dosage2 = kilograms2 * 30;
        
       System.out.printf("Patient 2: %s%n Weight: %.2f%n Converted to Kilos: %.2f%n Required dosage: %.2f%n", patientName2, weight2, kilograms2, dosage2);

        String patientName3 = "Gary";
        double weight3 = 170;
        double kilograms3 = weight3 * 0.45359237;
        double dosage3 = kilograms3 * 30;
        
       System.out.printf("Patient 3: %s%n Weight: %.2f%n Converted to Kilos: %.2f%n Required dosage: %.2f%n", patientName3, weight3, kilograms3, dosage3);
    }
}