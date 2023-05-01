package ThreadConcepts;

public class ThreadP1 extends Thread{
	
	public void run() {
		System.out.println("start thread");
	}
	
	

	public static void main(String[] args) {
		ThreadP1 obj=new ThreadP1();
		obj.start(); 
		
	}

}
