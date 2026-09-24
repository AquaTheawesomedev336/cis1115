package class_codes;
import java.util.Scanner;
public class switch_statements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number (1-7)");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("It is Monday!");
                break;

            case 2:
                System.out.println("It is Tuesday!");
                break;
            case 3:
                System.out.println("It is Wednesday!");
                break;
            case 4:
                System.out.println("It is Thursday!");
                break;
            case 5:
                System.out.println("It is Friday!");
                break;
            case 6:
                System.out.println("It is Sartuday!");
                break;
            case 7:
                System.out.println("It is Sunday!");
                break;
        
            default:
                System.out.println("Enter a valid number");
                break;
        }

        //combining cases

        switch(day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default: 
                System.out.println("Enter a valid number");

        }


         sc.close();
        }
         

    
    }
