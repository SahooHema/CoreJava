package StaticSynchronization;

public class BookTheatreSeat {
	
	static  int total_seats=20;
	  
public static synchronized void seats(int seats) {
	 if(total_seats>=seats) {
		 System.out.println(seats+" seats booked successfully");
		 total_seats=total_seats-seats;
		 System.out.println(total_seats+" seats left");
	 }
	 else {
		 System.out.println("seats not booked");
		 System.out.println(total_seats+" seats left");
	 }
}
}
