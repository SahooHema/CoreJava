package ThreadClassMethods;

public class Threadnaming1 extends Thread{
	
	public void run() {
		System.out.println("perform task");//perform task
		System.out.println(Thread.currentThread().getName());//Thread-0
	Thread.currentThread().setName("hema");
    System.out.println(Thread.currentThread().getName());//hema
	}

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());//main
		Threadnaming1 tn=new Threadnaming1();
	//	tn.setName("Mohini sahoo");
		tn.start();
		System.out.println(tn.isAlive());
		
		Threadnaming1 tn1=new Threadnaming1();
	//	tn1.setName("hema sahoo");
		tn1.start();
		System.out.println(tn1.isAlive());
	}

}
/*
The code written inside main block,will get executed by main thread
But, the thread created(Test obj=new Test()) inside main block, will be created by main thread and jvm provides naming to the thread
The run() of class will be executed by Thread created inside main block


main
perform task
Thread-0
hema


perform task
Thread-1
hema
Note: when create 2 thread, then Thread-0, Thread-1 will get printed as ThreadName

Note: public final native isAlive(); public final String getName(); public final synchronized void setName(String name);
*/