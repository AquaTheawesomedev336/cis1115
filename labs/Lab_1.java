package labs;
import java.util.Scanner;

public class Lab_1 {
    public static void main (String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Try to guess the correct number between 1 and 100 (inclusive)\n");

        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.println("You entered: "+ number);

        //declare variables
        int min = 1;
        int max = 100;
        //generate random number between 1 to 100(inclusive)
        int randomNum = min + (int)(Math.random() * ((max - min) + 1));
        System.out.println("The random number is: " + randomNum);

        //calculate diffrence between guessed number and random number
        int difference = Math.abs(number - randomNum);
        System.out.println("You were off by: " + difference);
        


        sc.close();


    }
}
