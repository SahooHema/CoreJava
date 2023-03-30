package Synchronization;

public class BookMyApp extends Thread{
	//static SeatBook sb;
	//static SynchronizedMethodDemo sm;
	static SynchronizedBlock sbb;
	int seats;
	
	public void run() {
		//sb.seats(seats);
		//sm.seats(seats);
	sbb.seats(seats);
	}

	public static void main(String[] args) {
		
	//sb=new SeatBook();
//	 sm=new SynchronizedMethodDemo();
sbb=new SynchronizedBlock();
		BookMyApp app=new BookMyApp();
		app.seats=7;
		app.start();
		
		
		BookMyApp app1=new BookMyApp();
		app1.seats=6;
		app1.start();
		
		
		
	}

}
/*
Output: data inconsistency coz of which synchronization is used
Synchronization:- It is a process by which we control the accessibility of multiple threads to a particular shared resources
Problem occur without synchronization:- 1)data inconsistency 2)Thread interference(thread deadlock)
Advantages of synchronization:-1)No data inconsistency 2)No thread interference
Disadvantages:-1)Increases the waiting time period of threads 2)create performance problems
Note: in new java version, java provided java.util.concurrent api by which we can solve disadvantage  pblm of synchronization.

How can we achieve synchronization:- by using synchronized keyword before any method name
Every object has it lock 
Every object divided into two area i.e. non-synchronized and synchronized area ..
Eg:if any thread want to access synchronized method ,then it need lock and once complete its task, it free lock and goes to dead state
Then another can access lock and complete its task..














*/