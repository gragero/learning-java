import static java.lang.System.*;
import java.util.Scanner;
import java.util.Random;

public class Gradetracker {
  public static void main(String[] args) {
    double[] grades = new double[5];
    Scanner in = new Scanner(System.in);

    for(int i = 0; i < 5; i++) {
      out.print("Enter the student grade " + (i + 1) + " : ");
      grades[i] = in.nextDouble();
    }
    double sum = 0;
    for(int i = 0; i < 5; i++) {
      sum += grades[i];
    }
    double average = sum / 5;
    out.println("the average is: " + average + " just...");
    double highest = grades[0];
    double lowest = grades[0];

    for (int i = 0; i < 5; i++) {
      if (grades[i] > highest) {
        highest = grades[i];
      }
      if (grades[i] < lowest) {
        lowest = grades[i];
      }
    }
    out.println("the lowest one is: " + lowest + " so bad...");
    out.println("but at the other hand the highest one is: " + highest + " good job man.");
  }
}
