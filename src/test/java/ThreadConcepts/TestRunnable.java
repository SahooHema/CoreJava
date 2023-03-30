package ThreadConcepts;

public class TestRunnable implements Runnable{
	

	public void run() {
		System.out.println("hdfjd");
		
	}
	
	public static void main(String[] args) {
		
		TestRunnable tr=new TestRunnable();
		Thread th=new Thread(tr);
		th.start();
		
	}


}

/*
How to create thread?
1.Class TestRunner implements Runnable
2.override run() of thread class(run() will perform thread task)
3.create object of TestRunner class
4.create object of Thread class and pass the object reference(parameter) in thread constructor 
5.call start() of thread class (it will call run() and perform task)










*/