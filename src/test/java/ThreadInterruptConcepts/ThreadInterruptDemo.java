package ThreadInterruptConcepts;

public class ThreadInterruptDemo extends Thread{
	
	public void run() {
		try {
			for(int i=1;i<=5;i++) {
				System.out.println(i);
				Thread.sleep(1000);
			}
			
		}catch(Exception e) {
			System.out.println("thread exception:"+e);
		}
	}
	

	public static void main(String[] args) {
		ThreadInterruptDemo obj=new ThreadInterruptDemo();
		obj.start();
		obj.interrupt();

	}

}
/*
Interrupt:- It is used to interrupt an executing thread 
Work: when thread is sleeping or waiting mode
if thread is not sleeping or waiting , then calling interrupt() will behave normal.
When we use interrupt(),it throws InterruptedException
Syntax:- public void interrupt().













*/