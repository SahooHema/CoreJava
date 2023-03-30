package InterThreadCommunication;

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
/*
synchronized(this):- meaning of "this" is lock released by the main thread and acquire by child thread




*/