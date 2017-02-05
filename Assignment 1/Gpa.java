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
      grades[it] = reader.next().toUpperCase();

      switch (grades[it]) {
        case "A":
          totalPoints += 4.00;
          break;  
        case "A-":
          totalPoints += 3.70;
          break;
        case "B+":
          totalPoints += 3.33;
          break;
        case "B":
          totalPoints += 3.00;
          break;
        case "B-":
          totalPoints += 2.70;
          break;
        case "C+":
          totalPoints += 2.30;
          break;
        case "C":
          totalPoints += 2.00;
          break;
        case "C-":
          totalPoints += 1.70;
          break;
        case "D+":
          totalPoints += 1.30;
          break;
        case "D":
          totalPoints += 1.00;
          break;
        case "D-":
          totalPoints += 0.70;
          break;
        default: 
          System.out.println("You entered an invalid input. Please try again.");
          break outerLoop;
      }
    }

    // Print Report 
    for (int it = 0; it < numberOfClasses; it++) {
      System.out.println("You earned a " + grades[it] + " in Course #" + (it+1));
    }

    // Calculate and print GPA
    System.out.println("\nYour GPA is " + totalPoints + " / " + numberOfClasses + " = " + (totalPoints/numberOfClasses));
  } 
}