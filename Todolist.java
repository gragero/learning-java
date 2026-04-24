import static java.lang.System.*;
import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

public class Todolist {
  public static void main(String[] args) {
    ArrayList<String> tasks = new ArrayList<>();
    int userin = 0;
    Scanner in = new Scanner(System.in);

    while (userin != 4) {

    out.println("\nchoose number...\n1. add to the list... \n2. remove from the list \n3. show the list... \n4. exit");
    try {
    userin = in.nextInt();
    in.nextLine();

    } catch (Exception e) {
      out.println("please don't be a stubid and Enter a number...");
      in.nextLine();
    }

    switch (userin) {
      case 1:
        out.print("add to the list: ");
        String add = in.nextLine();
        tasks.add(add);
        break;

      case 2:
        out.print("choose with the numbers what is you wanna to remove...: ");
        int remove = in.nextInt();
        tasks.remove(remove - 1);
        out.println("REMOVED!");
        break;

      case 3:
        out.println("--------this is the list----------");
        for (int i = 0; i < tasks.size(); i++) {
          out.println((i + 1) + ". " + tasks.get(i));
        }
        break;

      case 4:
        out.println("better to not see you again...");
        break;

      default:
        // out.println("please input an invaild something");
        break;
    }
    }
  }
}
