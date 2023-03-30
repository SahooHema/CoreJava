package ThreadClassMethods;

public class JoinThreadDemo1 extends Thread{
static	Thread mainthread;
public void run() {
	try {
		mainthread.join();
		for(int i=1;i<=5;i++) {
			System.out.println("child thread"+i);
		}
	}catch(Exception e) {
		System.out.println(e);
	}
	
}
	
	public static void main(String[] args) throws InterruptedException  {
     mainthread=	Thread.currentThread();
		JoinThreadDemo1 obj=new JoinThreadDemo1();
		obj.start();
		for(int i=1;i<=5;i++) {
			System.out.println("main thread"+i);
		}
	}
	}
	
	

/*
 Output:-Thread-0 will wait for the main thread to complete the task and then join it
main thread1
main thread2
main thread3
main thread4
main thread5
child thread1
child thread2
child thread3
child thread4
child thread5
 */
