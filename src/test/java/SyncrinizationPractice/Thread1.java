package SyncrinizationPractice;

public class Thread1 extends Thread{
	SeatBook b; 
	int seats;
	
	Thread1(SeatBook b ,int seats){
		this.b=b;
		this.seats=seats;
	}
	public void run() {
		b.seats(seats);
	}

}
