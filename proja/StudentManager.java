import static java.lang.System.*;
import java.util.Scanner;
import java.util.ArrayList;
// import


class StudentManager {
  public static void main(String[] args) {
    ArrayList<Student> stud = new ArrayList<>();
    Scanner in = new Scanner(System.in);
   
    stud.add(new Student("abo", 98.7));
    stud.add(new Student("hgag", 89));
    stud.add(new Student("elgmaed", 99.5));

    while (AskUser(in)) {
      Editstud(stud, in);
      ShowStudents(stud);
      getAvrg(stud);
      out.println("");
    } 
  }

  static void ShowStudents(ArrayList<Student> stud) {
  for (int i = 0; i < stud.size(); i++) {
    out.println((i + 1) + ". " + stud.get(i).name + ", " + stud.get(i).grade);
  }
 }

 static boolean AskUser(Scanner in) {
   out.print("Did you wanna to add, remove, or something? [Y/N]: ");
   char userans = in.next().charAt(0);
   in.nextLine();
   return userans == 'Y' || userans == 'y';
 }

 static void Editstud(ArrayList<Student> stud, Scanner in) {
   out.print("what is the name of the student: ");
   String name = in.nextLine();
   out.print("and the grade?: ");
   double grade = in.nextDouble();
   stud.add(new Student(name, grade));
   out.println("DONE!");
  }

 static double getAvrg(ArrayList<Student> stud) {
   double sum = 0;
   for (int i = 0; i < stud.size(); i++) {
    sum += stud.get(i).grade;
   }
   out.println("So the avrg is: " + sum / stud.size() + " just...");
   return sum / stud.size();
 }
 }
