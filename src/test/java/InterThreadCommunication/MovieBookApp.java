package InterThreadCommunication;

public class MovieBookApp {

	public static void main(String[] args) throws InterruptedException   {
		Earnings e=new Earnings();
		e.start();
//		System.out.println("total earning is:"+e.total);
       synchronized(e) {
    	   e.wait();
   		System.out.println("total earning is:"+e.total);
       }
	}

}
