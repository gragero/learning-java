import static java.lang.System.*;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Libsys {
  public static void main(String[] args) {
    Book book1 = new Book("clean code", "abo hgag", 2025);
    Scanner in = new Scanner(System.in);
    int userin = 0;
    out.println(book1.title + ", " + book1.author + ", " + book1.year);

    ArrayList<Book> books = new ArrayList<>();
    books.add(new Book("how to", "abo haga", 2026));
    books.add(new Book("os gaga", "abo haga", 2024));
    books.add(new Book("monster born", "abo haga", 2009));

    // for (int i = 0; i < books.size(); i++) {
      // out.println(books.get(i).title + ", " + books.get(i).author + ", " + books.get(i).year);

      while (userin != 4) {

      out.println("hi and welcome in my java world\nas you see...\n1. add book...\n2. remove book\n3. show the list\n4. exit");
      
      try {
      userin = in.nextInt();
       in.nextLine();
      } catch (Exception e) {
        out.println("numbers only...");
      }
        
      switch (userin) {
        case 1:
          out.print("insert the book title: ");
          String title = in.nextLine();
          out.print("insert the author book: ");
          String author = in.nextLine();
          out.print("insert the year: ");
          int year = in.nextInt();
          books.add(new Book(title, author, year));
          out.println("ADDED");
          break;

        case 2:
          out.print("insert number to remove the book: ");
          int remove = in.nextInt();
          books.remove(remove - 1);
          out.println("REMOVED!");
          break;

        case 3:
          out.println("----------this is the list of the books----------");
          for (int i = 0; i < books.size(); i++) {
            out.println((i + 1) + ". " + books.get(i).title + ", " + books.get(i).author + ", " + books.get(i).year);
            out.println("");
          }
          break;

        case 4:
          out.println("better to see you again...");
          break;

        default:
          break;
       }
      }
    }
  }

