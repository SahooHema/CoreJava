package ThreadClassMethods;

public class YieldThreadDemo extends Thread{
	public void run() {
		//Thread.yield();//if u want other thread to stop and give chance to main thread
		for(int i=1;i<=5;i++) {
			System.out.println(i+" "+Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {
		YieldThreadDemo obj=new YieldThreadDemo();
		obj.start();
        Thread.yield();//if u want main thread to stop and give chance to other thread
		for(int i=1;i<=5;i++) {
			System.out.println(i+" "+Thread.currentThread().getName());
		}

	}

}
/*
Yield()->It stops the current thread execution , give chance to other thread for execution
working of yield()->In java5 , it uses sleep() internally
In java6, it gives hint to the thread scheduler, but it depends upon scheduler to accept or ignore the hint
Method-> public static native void  yield();
Output may be different

Output of program:- first time
1 main
1 Thread-0
2 main
2 Thread-0
3 Thread-0
4 Thread-0
3 main
5 Thread-0
4 main
5 main

Output:- second time
1 main
1 Thread-0
2 main
2 Thread-0
3 Thread-0
3 main
4 Thread-0
5 Thread-0
4 main
5 main
Note: if other thread has high priority or same priority, then only it will give chance or else not..
Note: if thread is yield(), it does not guarantee when it will get executed

*/