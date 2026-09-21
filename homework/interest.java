package homework;
import java.util.Scanner;
import java.io.PrintWriter;

public class interest {
    public static void main(String[] args) throws Exception{


        Scanner scanner = new Scanner(System.in);
        double interest = 0.0231;

        //read input from user
        System.out.print("Enter current principal being invested in the savings account: ");
        int principal = scanner.nextInt();
        System.out.print("Enter number of years that the money will remain in the savings account: ");
        int years = scanner.nextInt();

        //calculate total
        double total = principal * Math.pow((1 + interest), years);

        scanner.close();

        //write the total to a file
        PrintWriter pw = new PrintWriter("interest.txt");
        pw.printf(" Total amount calculated with interest: $%f ", total);

        pw.close();






    }
}
