import java.util.Scanner;

public class Quiz {
  public static void main (String[] args) {
    boolean op1, op2, op3;
    int in1, in2, in3;
    String ans1, ans2, ans3;
    Scanner reader = new Scanner(System.in);

    while(true) {
      // Part 1
     while (true) {
      System.out.println("2+2=4?");
      op1 = reader.nextBoolean();
      System.out.println("2+3=5?");
      op2 = reader.nextBoolean();
      System.out.println("2+5=18?");
      op3 = reader.nextBoolean();

      if (op1==true && op2==true && op3==false) {
         break;
      } else {
        System.out.println("Oops! You answered at least one of the questions wrong. Try again.");
         break;
      }
      }

      // Part 2
      while(true) {
        System.out.println("Give me a number less than 15");
        in1 = reader.nextInt();

        if(in1<15) {
          break;
        } else {
          System.out.println("Ooops, that's not less than 15!");
        }
      }
      while(true) {
        System.out.println("Give me a number between 6 and 9");
        in2 = reader.nextInt();

        if(in2>6 && in2<9) {
          break;
        } else {
          System.out.println("Ooops, that's not a number between 6 and 9. Try again.");
        }
      }
      while(true) {
        System.out.println("Give me a number less than 6 or greater than 9");
        in3 = reader.nextInt();

        if(in3<6 || in3>9) {
          break;
        } else {
          System.out.println("Ooops, that's not less than 6 or greater than 9. Try again.");
        }
      }

      // Part 3
      System.out.println("What language do we learn in CSC 210? (Ans:java)");
      ans1 = reader.next();

      if(ans1.equals("java")) {
        System.out.println("What is the first name of professor teaching it? (Ans:shivam)");
        ans2 = reader.next();

        if(ans2.equals("shivam")) {
          System.out.println("Where do treehacks take place? (Ans:stanford)");
          ans3 = reader.next();
        
          if(!(ans3.equals("stanford"))) {
            System.out.println("Oh no! Restart the quiz!");
            continue;
          } else {
            System.out.println("Congratulations! You completed the quiz.");
           break;
          }
        } else {
          System.out.println("Oh no! Restart the quiz!");
          continue;
        }

      } else {
        System.out.println("Oh no! Restart the quiz!");
        continue;
      }
    }     
    
	}
}