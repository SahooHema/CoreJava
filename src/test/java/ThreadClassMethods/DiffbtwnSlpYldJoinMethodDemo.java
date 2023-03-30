package ThreadClassMethods;

public class DiffbtwnSlpYldJoinMethodDemo {

	public static void main(String[] args) {
	

	}

}
/*
Interview Questions:-
Sleep:-purpose:- if thread does not want to perform any operation for particular time
eg:-PPT,Timer,Blinking bulb
How the thread invoked again:- 1)automatically after provided time period 2) if thread is interrupted
Methods:- public static native void sleep(long millisec),  public static void sleep(long milli,int nano)
Is method overloaded:- yes






Yield:-eg:-Shopping
How the thread invoked again:- automatically invoked by thread scheduler
Method:- public static native void yield()
Is method overloaded:- no




Joins:-eg:license dept.
How the thread invoked again:- 1)automatically invoked after the completion of another task
2)After completion of time period
3)If thread is interrupted
Methods:- public final void join(),public final synchronized void join(long millisec),public final synchronized void join(long millisec,int nanosec)
Is method overloaded:- yes
















*/