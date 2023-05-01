package ThreadClassMethods;

public class DaemonThreadDemo  extends Thread{
	
	public void run() {
		System.out.println(Thread.currentThread().isDaemon());//false( in case if thread is not daemon), true(in case if thread is daemon)
		System.out.println("daemon thread");
		
	}

	public static void main(String[] args) {
      System.out.println("main thread");
		DaemonThreadDemo obj=new DaemonThreadDemo();
		obj.setDaemon(true);
		obj.start();
		
}}







/*Definition:- it is running in background of another thread
Use:- it provide service to the  threads
Eg:GarbageCollector(if main memory face pblm i.e.memory leakage, memory full, it will delete unused objects from memory and provide memory to main )
SpellingChecker(if we write text in word doc, the spelling which is not correct, it shows red line)
finalizer,attach listener,signal dispatch etc..
Methods:- 1) public final void setDaemon(boolean b) 2) public final boolean isDaemon()
Cases:- 
1. we need to create daemon thread before start().
   If we create daemon thread after start() , it will throw runtime exception

2.we cannot create main thread as daemon thread,  coz main thread will already get started 
The life line of daemon thread will depend upon main thread.As long as main thread will executed , daemon thread will work
Daemon thread nature:- it inherit properties from main thread 
JVM role in daemon thread:- if there are normal threads which is in dead state, jvm will also get shut down.But if, there is daemon thread ,jvm will kill daemon thread(put in dead state) and then jvm will get shut down..
Most of the times, daemon thread has low priority.But we can change its priorities acc. to our need



*/