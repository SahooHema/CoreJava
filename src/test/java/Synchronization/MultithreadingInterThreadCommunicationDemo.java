package Synchronization;

public class MultithreadingInterThreadCommunicationDemo {

	public static void main(String[] args) {
	

	}

}

/*Inter-thread communication:- It is a mechanism in which the thread release its lock and enter into the pause state and another thread then acquires the lock and continue the execution

Methods:- these methods are object methods 1)wait 2)notify 3)notifyAll
wait:- current thread release its lock and wait until another thread call notify method..
wait:- we can also provide time in wait(), after time elapsed it will automatically print the statement
notify:- wake the current  thread which is in waiting state and release its lock and provide to current thread
notifyAll:- wake all the threads
Note: all above methods is used inside the synchronized block
Syntax:- public final void wait(),public final void wait(time milisec),public final void notify(),public final void notifyAll().















*/