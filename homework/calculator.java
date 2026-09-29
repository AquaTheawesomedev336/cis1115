package homework;
import java.util.Scanner;
public class calculator {
    public static void main(String[] args){

        //prompt user for input
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first Number: ");
        double firstNumber = in.nextDouble();

        System.out.print("Enter second Number: ");
        double secondNumber = in.nextDouble();

        System.out.println("Operations:");
        System.out.println("  Addition (+)");
        System.out.println("  Subtraction (-)");
        System.out.println("  Multiplication (*)");
        System.out.println("  Division (/)");
        System.out.println("  Modulus (%)");
        System.out.println("  Exponent (^)");
        System.out.print("Enter a mathematical operation: ");
        String operation = in.next();

        double total = 0;

        //test cases
        switch(operation) {
            case "+":
                total = firstNumber +  secondNumber;
                System.out.println("Result: " + total);
                break;
            case "-":
                 total = firstNumber -  secondNumber;
                System.out.println("Result: " + total);
                break;
            case "*":
                 total = firstNumber *  secondNumber;
                System.out.println("Result: " + total);
                break;
            case "%":
                 total = firstNumber %  secondNumber;
                System.out.println("Result: " + total);
                break;
            case "/":
                 total = firstNumber / secondNumber;
                System.out.println("Result: " + total);
                break;
            case "^":
                 total =  Math.pow(firstNumber, secondNumber);
                System.out.println("Result: " + total);
                break;
            default: 
                System.out.println("Invalid Operation! (enter a valid operation)");

        }

        in.close();



    }
}