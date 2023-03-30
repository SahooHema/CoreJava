package ThreadClassMethods;

public class SleepThreadDemo1 extends Thread{
	
	public void run() {
	
		try {
			for(int i=1;i<=5;i++)	{
			Thread.sleep(1000);
				//Thread.sleep(-1);
		//		Thread.sleep(1000,-1);
			System.out.println(i);
		}}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

	public static void main(String[] args) {
		
		SleepThreadDemo1 obj= new SleepThreadDemo1();
		obj.start();
		
		
	}

}
//Note: Thread-0 using sleep()
/*
Remember:-
if pass -1 in sleep(), then illegalArugumentException, timeout value is negative
if pass 1000,-1 in sleep(), then illegalArugumentException, nanosecond timeout value out of range
nanoseconds  value is between 0-999999





*/