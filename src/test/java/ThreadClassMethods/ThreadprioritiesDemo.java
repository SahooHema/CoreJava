package ThreadClassMethods;

public class ThreadprioritiesDemo extends Thread{
	
	public void run() {
		System.out.println(Thread.currentThread().getPriority());//5//10(in case of set priority)
		System.out.println("priority thread");
	}

	public static void main(String[] args) {
		Thread.currentThread().setPriority(NORM_PRIORITY);//constants
		Thread.currentThread().setPriority(10);
		System.out.println(Thread.currentThread().getPriority());//5//10(in case of set priority to the main thread)
		ThreadprioritiesDemo obj=new ThreadprioritiesDemo();
		obj.start();
	   obj.setPriority(10);

	}

}

/*
JVM provides priorities to each thread, based on priorities provides processor 
If thread has same priorities, it depends upon jvm to provide processor to which thread first
Priorities are represented in the form of integer value ranges from 1-10.
eg:- 1->MIN_PRIORITY,5->NORM_PRIORITY,10->MAX_PRIORITY
Below are not the priorities:- 0,<1,>10
Methods:- 1)public final void setPriority(int value) 2) public final int getPriority();
Note: the main thread priority provided by JVM is 5
The priority of thread(child thread) created by main thread is also 5 (means properties inherit from main thread)
We can also set priority in main thread, it will set for other thread
We can also set priority for child thread
If Priority is not in range 1-10, it will throw runtime exception i.e. IllegalArgumentException.
Priorities depends upon the platform(windows does not support priorities due to which any thread can be executed means first with low priority or high priority) 
Note: All above mentioned  points are imp for interview Questions.




*/