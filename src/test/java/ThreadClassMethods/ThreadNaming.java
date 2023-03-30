package ThreadClassMethods;

public class ThreadNaming {
	
	public static void main(String[] args) {
	
	System.out.println(Thread.currentThread().getName());//main
	Thread.currentThread().setName("hema");
	System.out.println(Thread.currentThread().getName());//hema
	int a=10/0;//Exception in thread "hema" java.lang.ArithmeticException: / by zero

}
}
/*
Main thread created and jvm created it
set name for the thread
get name for the thread
if use only set() and 10/0 this line of code, then error Exception in thread "hema" java.lang.ArithmeticException: / by zero
ThreadNaming methods are:- 1.getName() 2.SetName()
currentThread()-> Returns a reference to the currently executing thread object.

Note: public static  native Thread currentThread();
      




*/