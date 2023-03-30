package ThreadClassMethods;

public class JoinThreadDemo extends Thread{
	
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(i+":"+Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) throws InterruptedException  {
		JoinThreadDemo obj=new JoinThreadDemo();
		obj.start();
		obj.join(1000,1);
		for(int i=1;i<=5;i++) {
			System.out.println(i);
		}
		

	}

}

/*
Join() :-If a thread wants to wait for another thread to complete its task the we can use join() 
eg:-for license we have to go through process i.e. medical(1st thread),test drive(2nd thread), license(3rd thread)
Now, Test drive will wait for medical to complete its task,then join it ..
Methods:- public final void join(), public final synchronized void join(long milisec),public final synchronized void join(long milisec,int nanosec).
Output:-Main Thread wait for the Thread-0, to complete the task and then join it..
1:Thread-0
2:Thread-0
3:Thread-0
4:Thread-0
5:Thread-0
1
2
3
4
5
*/