package excercises;
import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;

public class readingFiles {
    public static void main(String[] args) throws Exception {
        //if youre are reading froma line it needs to exist

        File f = new File("text_files/input.txt");
        Scanner scanner = new Scanner(f);

        int a = scanner.nextInt();
        double b = scanner.nextDouble();
        String c = scanner.next();

        System.out.println("Interger: " + a);
        System.out.println("Foating-point number: " + b);
        System.out.println("String: " + c);

        scanner.close();

        
        //write to a file
        PrintWriter output = new PrintWriter ("output.txt");

        output.println("Interger: " + a);
        output.println("Foating-point number: " + b);
        output.println("String: " + c);

        output.close();




        
        





    }
}