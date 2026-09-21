package class_codes;
import java.util.Scanner;


public class hello{
    public static void main(String[] args) { 
     double payRate = 42.09;
     int pay = (int) payRate; // type casting double to int
        System.out.println(pay);
    
    //interger and floating point dision

    int result = 10 / 3; //interger division
        System.out.println(result);
    
    //floating point division needs at leasat one operand to be a floating point number
    double result2 = 10.0 / 3;
        System.out.println(result2);

    System.out.println(Math.abs(-10)); //absolute value
    System.out.println(Math.sqrt(4)); //square root of a number
    System.out.println(Math.pow(2, 3)); //power of a exponent
    

    // Math.random() generates a random number between 0.0(inclusive) and 1.0(exclusive)
    
    double randomNumber = Math.random();
        System.out.println("Random Number: " + randomNumber); 
        

    int randomInt = (int) randomNumber;
        System.out.println(randomInt);

    //initializing a string variable
    String s = "Hello World";
    System.out.println(s);

    //Scanner class is used to read input from the user
    Scanner scanner = new Scanner (System.in);
    
    System.out.print("Enter your name:");
    String name = scanner.nextLine();
    System.out.println("Hello, " + name + "!");
    
    scanner.close();


    

    







        } 
    }