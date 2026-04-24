import static java.lang.System.*;
import java.util.*;

class Main {
  public static void main(String[] args) {
    ArrayList<Room> room = new ArrayList<>();
    ArrayList<Reservation> reserv = new ArrayList<>();
    Scanner in = new Scanner(System.in);
   
    room.add(new Room("Normal", "Sharing", true));
    room.add(new Room("VIP", "Sharing", true));
    room.add(new Room("Office", "Single", true));
    room.add(new Room("Office", "Double", true));
    room.add(new Room("Office", "Double2", true));
    room.add(new Room("Room", "Meeting", true));
    room.add(new Room("Room", "Metting(B)", true));
    room.add(new Room("Room", "Trainig", true));

    out.println("");
    out.println("-------------MENU-------------");

    while (true) {
      out.println("");
      ShowRooms(room);
      Askuser(in, reserv, room);
      // if (!Askuser(in)) break; 
      // makeReservation(reserv, room, in);
      // Showreservstion(reserv);
    }

  }
    static void ShowRooms(ArrayList<Room> room) {
      for (int i = 0; i < room.size(); i++) {
          out.println((i + 1) + ". " + room.get(i).name + ", " + room.get(i).type + ", " + (room.get(i).isAvailable ? "free" : "busy"));
      }
      out.println("");
      out.println("thanks for visit SECRET Co-Working Space. ");
      out.println("");
  }

  static void Askuser(Scanner in, ArrayList<Reservation> reserv, ArrayList<Room> room) {

    out.println("1. make a reservation\n2. show available rooms\n3. show reservations\n4. reservation cancel\n5. exit");
    int userans = in.nextInt();
    switch (userans) {
      case 1:
        makeReservation(reserv, room, in);
        break;

      case 2:
        ShowRooms(room);
        break;

      case 3:
        Showreservstion(reserv);
        break;

      case 4:
        ReservationCancel(reserv, room, in);
        break;

      case 5:
        System.exit(0);

      default:
        out.println("Insert vaild option");
        break;
    }
  }

  static void makeReservation(ArrayList<Reservation> reserv, ArrayList<Room> room, Scanner in) {
    out.print("what's your name?: ");
    String name = in.next();
    in.nextLine();
    out.print("insert room number of the menu: ");
    int add_room = in.nextInt();
    if (add_room < 1 || add_room > room.size()) {
      out.println("insert a vaild number plz...");
      return;
    }
    out.print("now insert the date: ");
    String add_date = in.next();
    in.nextLine();
    out.print("when will you start?: ");
    String strarttime = in.next();
    in.nextLine();
    out.print("can you type your phone?: ");
    String phone = in.next();
    in.nextLine();
    out.print("how much you wanna be here?[H]: ");
    int duration = in.nextInt();
    out.println("");
    out.println("DONE!");
    Random rand = new Random();
    int code = rand.nextInt(1000000);
    out.println("this is your code: " + code + " if you wanna to cancel the reservation."); 
    out.println("");

    Customer customer = new Customer(name, phone);
    reserv.add(new Reservation(customer, room.get(add_room - 1), add_date, strarttime, duration, code));
    room.get(add_room - 1).isAvailable = false;
  }

  static void Showreservstion(ArrayList<Reservation> reserv) {
    if (reserv.size() == 0) return;
    out.println("----------------------------------------------");
    out.println("this is the reservation at the same time......");
    out.println("");
    for (int i = 0; i < reserv.size(); i++) {
      out.println((i + 1) + ". " + reserv.get(i).date + ", " + reserv.get(i).room.type + ", " + reserv.get(i).starttime + ", " + reserv.get(i).duration + "H");
      out.println("");
    }
  }

  static void ReservationCancel(ArrayList<Reservation> reserv, ArrayList<Room> room, Scanner in) {
    out.print("Enter the reservation code: ");
    int code = in.nextInt();
    for (int i = 0; i < reserv.size(); i++) {
      if(reserv.get(i).code == code) {
        Room r = reserv.get(i).room;
        r.isAvailable = true;
        reserv.remove(i);
        out.println("The Reservation is CANCELLED Successfully.");
        return;
      }
    }
    out.println("Sorry can you check the code again?...");
  }
}
