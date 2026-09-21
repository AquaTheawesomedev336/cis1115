package excercises;
import java.util.Scanner;

public class time_converter {
    public static void main(String[] args) {
        // declare variables
        final int SEC_TO_MINUTES = 60;
        final int MIN_TO_HOUR = 60;
        final int SEC_TO_HOUR = SEC_TO_MINUTES * MIN_TO_HOUR; // 3600

        Scanner input = new Scanner(System.in);

        // prompt user for seconds
        System.out.print("Enter number of seconds: ");
        int totalSeconds = input.nextInt();

        // convert seconds to hours, minutes, seconds
        int hours = totalSeconds / SEC_TO_HOUR;
        int minutes = (totalSeconds % SEC_TO_HOUR) / SEC_TO_MINUTES;
        int seconds = totalSeconds % SEC_TO_MINUTES;

        System.out.println(hours + " hours, " + minutes + " minutes, " + seconds + " seconds");

        input.close();
    }
}
