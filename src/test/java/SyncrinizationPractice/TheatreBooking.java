package SyncrinizationPractice;

public class TheatreBooking {

	public static void main(String[] args) throws InterruptedException {
		Earnings e=new Earnings();
		e.start();
		synchronized(e) {
			e.wait();
		System.out.println(e.total);

	}
		}

}
