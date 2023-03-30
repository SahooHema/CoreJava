package Synchronization;

public class SynchronizedMethodDemo {
	
	  int total_seats=10;
	  
public synchronized void seats(int seats) {
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

/*
How can we achieve synchronization:- by using synchronized keyword before any method name
Every object has it lock 
Every object divided into two area i.e. non-synchronized and synchronized area ..
Eg:if any thread want to access synchronized method ,then it need lock and once complete its task, it free lock and goes to dead state
Then another can access lock and complete its task..
*/