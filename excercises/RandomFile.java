package excercises;
import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;

public class RandomFile {
   public static void main(String[] args) throws Exception {

    //read in user's name (from standard input)
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Enter first name: ");
    String firstName = keyboard.next();
    System.out.print("Enter last name: ");
    String lastName = keyboard.next();
    //creat a filename "[last name]_[first name]_info.txt"
    String filename = lastName + "_" + firstName + "_info.txt";
    //System.out.println(filename);
    keyboard.close();

    //generate ID number 1000 - 9999
    int min = 1000; //inclusive
    int max = 10000; //exclusive
    int id = (int) (Math.random() * (max - min) + min);


    //write info to file
    PrintWriter pw = new PrintWriter(filename);
    pw.print(id);
    pw.close();

    //read random id number from created file
    //read name of  file to print
    /*System.out.print("\n\nEnter user name: ");
    String first = keyboard.next();
    String last = keyboard.next();
    */

    //read random id number from created file
    Scanner input = new Scanner(new File(filename));
    int userID = input.nextInt();
    System.out.print("ID #: " + userID);

    input.close();
   }  
}
