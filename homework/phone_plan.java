package homework;
import java.util.Scanner;
import java.io.PrintWriter;
public class phone_plan {
    public static void main(String[] args) throws Exception{

        PrintWriter out = new PrintWriter("monthlyBill.txt");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Phone Plan (Option 1, 2, or 3): ");
        int option = sc.nextInt();

        System.out.print("Enter number of Minutes used this month: ");
        int minutes = sc.nextInt();

        if (option == 1) {
            out.println("Phone Plan: 1");
            out.println("Number of Minutes used this month: " + minutes);
            out.printf("Total: $%.2f%n", 89.00);

        } else if (option == 2) {
            out.println("Phone Plan: 2");
            out.println("Number of Minutes used this month: " + minutes);
            System.out.print("Enter number of text messages: ");
            int texts = sc.nextInt();
            out.println("Number of text messages sent this month: " + texts);
            double price = texts * 0.05;
            double total = price + 79.00;
            out.printf("Total: $%.2f%n", total);

        } else if (option == 3) {
            double total = 35.00;
            out.println("Phone Plan: 3");
            out.println("Number of Minutes used this month: " + minutes);

            if (minutes > 50) {
                out.println("50 Minute Limit Exceeded! -- Additional $0.03/minute charge applied");
                double additionalCharge = (minutes - 50) * 0.03;
                total = additionalCharge + 35;
            }
            out.printf("Total: $%.2f%n", total);
        }
        sc.close();
        out.close();
    }
}