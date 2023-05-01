package SyncrinizationPractice;

import Synchronization.BookMyApp;

public class MyBookApp extends Thread{
	

	public static void main(String[] args) {

		SeatBook	sb=new SeatBook();
	
		Thread1 t1=new Thread1(sb, 7);
		t1.start();
		
		
		Thread1 t2=new Thread1(sb, 7);
		t2.start();
		
		SeatBook	sb1=new SeatBook();
		
		
		Thread1 t3=new Thread1(sb1, 7);
		t3.start();
		
	
		Thread1 t4=new Thread1(sb1, 7);
		t4.start();
		

	}

}
