package ThreadClassMethods;

public class SleepThreadDemo {

	public static void main(String[] args) throws InterruptedException {
	
	try {
		 for(int i=1;i<=5;i++) {
		Thread.sleep(1000);
		 System.out.println(i);
	 }}
	catch(Exception e) {
		System.out.println(e);
	}

	

}}

//Note: main thread using sleep()
/*
Thread class has two sleep methods . 1) public static native void sleep(long miliisec) throws InterruptedException
2) public static void sleep(long miliisec, int nano) throws InterruptedException
Sleep() throws compile time exception , to handle it ,need to throws exception or else use try and catch block..
it will make current executing thread to go to sleep mode
sleep() is overloaded method
eg: Blinking bulb use sleep(), timer, PPT etc..
->JVM finds the sleep() in the code, it will check which thread is running and pause the thread execution
->When we use sleep() to pause the execution of thread, thread scheduler assigns the CPU to another thread if exists.
So there is no guarantee that thread wakes up exactly after the time specify in sleep().
it totally depend upon thread scheduler.
-> when thread is sleeping, it doesn't loose any locks or monitor that it had acquired before sleeping
Remember for interview questions

*/