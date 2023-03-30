package ThreadConcepts;

public class TestThread extends Thread{

	public void run() {
		System.out.println("sdffd");//thread task perform
	}
	

	public static void main(String[] args) {
	
		TestThread obj=new TestThread();
		obj.start();
		
		TestThread obj1=new TestThread();
        obj1.start();	
	
} 

}







/*
When multiple sub process or small tasks or threads is executing at the single time is c/d multithreading
eg: when play VLCC(process or program) , music will play,volume inc or dec, progress bar, percentage + or -(these are c/d threads)
eg: games s/w, animation,word 
It is best suited at programming level(need only 10-20% for using multihreading)
java provides pre-defined api's for multithreading

LifeCycle of Thread:-
1.create thread by using (Test obj=new Test();)
2.runnable by using(start())
3.running by using run() (jvm allocate the processor to the thread and thread will perform task)
4.dead(after dead thread cannot go to new state)
5.non-runnable state(when thread sleep,waiting,suspend)
Note: when thread is in non-runnable state it can again go to runnable state

How to create thread?
1.Class Test extends Thread class
2.override run() of thread class(run() will perform thread task)
3.create object of Test class(thread is created)
4.call start() of thread class (it will call run() and perform task)


Note: public synchronized start();



*/