import java.util.Scanner;
public class gpa {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int numberOfClasses;
    String[] grades = new String[7];
    double totalPoints = 0;

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

    // Ask for users' grades
    System.out.println("\nAccepted inputs: A, A-, B+, B, B-, C+, C, C-, D+, D, D-");

    outerLoop: for (int it = 0; it < numberOfClasses; it++) {
      System.out.println("Enter grade for Class #" + (it+1));
      String gradeInput = reader.next();
      // // Check if gradeInput is a valid input
      // while (gradeInput != "A" || gradeInput != "A-") {
      //   System.out.println("\nPlease enter a valid input. Accepted inputs: A, A-, B+, B, B-, C+, C, C-, D+, D, D-");
      //   System.out.println("Enter grade for Class #" + (it+1));
      //   gradeInput = reader.next();
      // }
      switch (gradeInput) {
        case "A":
          totalPoints += 4.00;
          break;
        default: 
          System.out.println("You entered an invalid input. Please try again.");
          break outerLoop;
      }
    }

  } 
}