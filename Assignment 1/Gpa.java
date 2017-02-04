import java.util.Scanner;
public class gpa {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int numberOfClasses;
    double aPlus = 4.00;
    double aMinus = 3.70;
    double bPlus = 3.33;
    double b = 3.00;
    double bMinus = 2.70;
    double cPlus = 2.30;
    double c = 2.00;
    double cMinus = 1.70;
    double dPlus = 1.30;
    double d = 1.00;
    double dMinus = 0.70;
    String[] grades = new String[7];

    // Ask for number of classes  
    System.out.println("How many classes did you take?");
    System.out.println("(Enter a number between 4 and 7)");
    numberOfClasses = reader.nextInt();

    // Check if numberOfClasses is between 4 and 7
    while (!(numberOfClasses >= 4 && numberOfClasses <= 7)) {
      System.out.println("Please enter a number between 4 and 7");
      System.out.println("How many classes did you take?");
      numberOfClasses = reader.nextInt();
    } 

    // Asking for users' grades
    for (int it = 0; it < numberOfClasses; it++) {
      System.out.println("Enter grade for Class #" + (it+1));
      System.out.println("Accepted inputs: A, A-, B+, B, B-, C+, C, C-, D+, D, D-");
      grades[it] = reader.next();
    }
  } 
}