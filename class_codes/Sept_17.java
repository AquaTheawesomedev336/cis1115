package class_codes;



public class Sept_17 {
    public static void main(String[] args) throws Exception {
        //File (new File (filename)) --> input to read file (.txt)
        //new scanner --> creates a new instance of the scanner class (object)
        //filename "__.txt" a relative path

        /*
        String filename = "inputFile.txt"; //name of the file that we are reading from
        File f = new File(filename); //File obj associated w/ file name
        Scanner sc = new Scanner(filename); //read from input file

        */

        /* 
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();

        int exam1 = sc.nextInt();
        int exam2 = sc.nextInt();

        
        System.out.println("Name: " + name);
        System.out.println("Exam1 Score: " + exam1);
        System.out.println("Exam2 score: " + exam2);


        //compute average score
        double averageScore = exam1 + exam2 / 2;
        System.out.println("Average Score: " + averageScore);

        


        sc.close();

        //another method to write to a file
        String Filename = "exam_scores.txt"; //stores the file name in a variable
        File examScoreFile = new File(Filename); // coverts the stirng literal to a file
        PrintWriter out = new PrintWriter(examScoreFile); // print output to file


        PrintWriter pw = new PrintWriter("exam_scores.txt");
        pw.println("Name: " + name);
        pw.println("Exam1 Score: " + exam1);
        pw.println("Exam2 score: " + exam2);
        pw.println("Average Score: " + averageScore);

        pw.close();

        
        */

    boolean isHoliday = true;

    if (isHoliday) {
        System.out.println("There is class today");
    } else {
        System.out.println("No class today");
    }

        
    }
}