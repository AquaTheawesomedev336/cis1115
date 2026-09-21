import java.util.Scanner;

public class conditional {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt(); 

        if (number > 1) {
            System.out.println(number + " is greater than 1" + ".");
        } else {
            System.out.println(number + " is not greater than 1" + ".");
        }
        input.close();
    }
}