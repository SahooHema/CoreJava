package ThreadClassMethods;

public class CasesOfSleepThreadDemo extends Thread{

	public void run() {
		try {
			for(int i=1;i<=5;i++){
				Thread.sleep(1000);
				System.out.println(i+":"+Thread.currentThread().getName());
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		CasesOfSleepThreadDemo obj=new CasesOfSleepThreadDemo();
		//obj.start();
		obj.run();
		
		CasesOfSleepThreadDemo obj1=new CasesOfSleepThreadDemo();
		//obj1.start();
        obj1.run();
	}
}
/* Output of 2 threads:-sssss
1:Thread-1
1:Thread-0
2:Thread-0
2:Thread-1
3:Thread-1
3:Thread-0
4:Thread-1
4:Thread-0
5:Thread-1
5:Thread-0
case1: to check which thread goes in sleep mode mentioned above(all threads execute at the same time)
case2: if used run() instead of start() , then main method will execute , and create object and call run() directly..In this case main method will execute 2 times.No thread is created.
Output:-
1:main
2:main
3:main
4:main
5:main
1:main
2:main
3:main
4:main
5:main
*/