class Reservation {
  Customer customer;
  Room room;
  String date;
  String starttime;
  int duration;
  int code;
  Reservation(Customer customer, Room room, String date, String starttime, int duration, int code) {
    this.customer = customer;
    this.room = room;
    this.date = date;
    this.starttime = starttime;
    this.duration = duration;
    this.code = code;
  }
}
