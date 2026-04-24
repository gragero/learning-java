import java.util.Scanner;
import static java.lang.System.*;

public class Calculator {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    out.print("Enter the first number: ");
    double num1 = in.nextDouble();

    out.print("Enter the second number: ");
    double num2 = in.nextDouble();

    out.print("Enter the OP: ");
    String op = in.next();

    switch(op) {
      case "+":
        out.println("the plus role is: " + (num1 + num2) + " that is easy man...");
        break;

      case "-":
        out.println("the minus role is: " + (num1 - num2) + " that it...");
        break;

      case "*":
        out.println("the times role is: " + ( num1 * num2 ) + " just...");
        break;

      case "/":
        if(num2 == 0) {
          out.println("there is any stubid divisioning by 0 ????");
          return ;
        } else {
        out.println("the division role is: " + (num1 / num2) + " at the end...");
        break;
        }

      default:
        out.println("please Enter a vaild somthing...");
    }

  }
}

