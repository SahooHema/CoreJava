package ThreadInterruptConcepts;

public class IsinterruptedAndInterruptMethodDemo extends Thread{
	
	public void run() {
		try {
//System.out.println(Thread.interrupted());//true
		System.out.println(Thread.currentThread().isInterrupted());//true
			for(int i=1;i<=5;i++) {
				System.out.println(i);
				Thread.sleep(1000);
			//	System.out.println(Thread.currentThread().isInterrupted());
			//System.out.println(Thread.interrupted());
			}
		}catch(Exception e) {
			System.out.println(e);//1 java.lang.InterruptedException: sleep interrupted
		}
	}

	public static void main(String[] args) {
		IsinterruptedAndInterruptMethodDemo obj=new IsinterruptedAndInterruptMethodDemo();
		obj.start();
		obj.interrupt();

	}

}
/*
Interrupted:-It is used to check whether thread is interrupted or not
It clears the interrupted status from true to false
It will change the result if c/d twice
Syntax:- public static boolean interrupted()


IsInterrupted:-It is used to check whether thread is interrupted or not
It does not clears the interrupted status from true to false
It will provide same result if c/d twice
Syntax:- public boolean isInterrupted()







*/