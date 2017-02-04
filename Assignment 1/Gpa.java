import java.util.Scanner;
public class gpa {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int numberOfClasses;

		// Ask for number of classes	
		System.out.println("How many classes did you take?");
		System.out.println("(Enter a number between 4 and 7)");
		numberOfClasses = reader.nextInt();

		// Check if numberOfClasses is between 4 and 7
		while (!(numberOfClasses>4 && numberOfClasses<7)) {
			System.out.println("Please enter a number between 4 and 7");
			System.out.println("How many classes did you take?");
			numberOfClasses = reader.nextInt();
		} 
	} 
}