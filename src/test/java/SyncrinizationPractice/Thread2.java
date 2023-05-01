package SyncrinizationPractice;

public class Thread2 {
	SeatBook b; 
	int seats;
	
	Thread2(SeatBook b ,int seats){
		this.b=b;
		this.seats=seats;
	}
	public void run() {
		b.seats(seats);
	}
}
