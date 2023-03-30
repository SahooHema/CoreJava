package Synchronization;

public class SynchronizedBlock {
	
	  int total_seats=10;
	  
public  void seats(int seats) {	
	System.out.println(Thread.currentThread().getName());
	System.out.println(Thread.currentThread().getName());
	System.out.println(Thread.currentThread().getName());
	
	synchronized(this) {
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
	System.out.println(Thread.currentThread().getName());
	System.out.println(Thread.currentThread().getName());
	System.out.println(Thread.currentThread().getName());
}




}



/*
It is used for decreasing the waiting time period for threads
It makes programming speed fast
Synchronized block is used where data inconsistency can occur , used block in that part of the code acc to requirement instead of using synchronized keyword for whole method
synchronized block scope is less as compared to synchronized method









*/