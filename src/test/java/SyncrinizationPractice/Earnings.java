package SyncrinizationPractice;

public class Earnings extends Thread{
	int total=0;
	
	public void run() {
		synchronized(this) {
		for(int i=1;i<=10;i++) {
			total=total+100;
		}
		this.notify();
	}
	}
	

}
