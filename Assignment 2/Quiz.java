import java.util.Scanner;

public class Quiz {
	public static void main (String[] args) {
    boolean op1, op2, op3;
    Scanner reader = new Scanner(System.in);

    // Part 1
    while (true) {
     System.out.println("2+2=4?");
     op1 = reader.nextBoolean();
     System.out.println("2+3=5?");
     op2 = reader.nextBoolean();
     System.out.println("2+5=18?");
     op3 = reader.nextBoolean();

     if (op1==true && op2==true && op3==false) {
       System.out.println("Yo!");
     }

    }
	}
}