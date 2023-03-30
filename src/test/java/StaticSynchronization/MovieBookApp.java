package StaticSynchronization;

public class MovieBookApp {

	public static void main(String[] args) {
		BookTheatreSeat b1=new BookTheatreSeat();
		
		MyThread1 t1=new MyThread1(b1, 7);
		t1.start();
		
		MyThread2 t2=new MyThread2(b1, 6);
		t2.start();
		
		BookTheatreSeat b2=new BookTheatreSeat();
		
		MyThread1 t3=new MyThread1(b2, 5);
		t3.start();
		
		MyThread2 t4=new MyThread2(b2, 8);
		t4.start();
		
	}

}
/*
Note:- when two objects created, then t1 thread interfere with t3 & t4...then t2 thread interfere with t3 & t4.To avoid this(data inconsistency), we use static synchronization..
Use static keyword with  synchronized before method, now class lock will be implemented..
Every class has its lock and object has its lock
Now, t1 thread need class lock, then object lock ..and every thread needs class lock, then object lock..

Output:-when one object is created
7 seats booked successfully
3 seats left
seats not booked
3 seats left

Output:- when two objects are created and   int total_seats=20;
7 seats booked successfully
13 seats left
6 seats booked successfully
5 seats booked successfully
15 seats left
7 seats left
6 seats booked successfully
9 seats left


Output:- when static synchronized keyword used before method
7 seats booked successfully
13 seats left
6 seats booked successfully
7 seats left
5 seats booked successfully
2 seats left
seats not booked
2 seats left
*/