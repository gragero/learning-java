import java.util.Scanner;
import static java.lang.System.*;
import java.util.Random;


public class Guessinggame {
  public static void main(String[] args) {
    Random random = new Random();
    int secretNumber = random.nextInt(1 + 100);
    Scanner input = new Scanner(System.in);

    int userguess = 0;
    while (userguess != secretNumber) {

      out.println(secretNumber);
      out.print("Guess a number between 0 and 100: ");
    userguess = input.nextInt();

    if(userguess < secretNumber) {
      out.println("low...");
      out.println("");
    }

    else if(userguess > secretNumber) {
      out.println("high...");
      out.println("");
    }

    else {
      out.println("nice... that is my boy.");
      out.println("that was... " + secretNumber + " bro...");
      out.println("");
    }
}

    input.close();


  }
}
