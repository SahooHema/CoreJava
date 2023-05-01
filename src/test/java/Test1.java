
public class Test1 implements Test12,Test13{
	
	public void walk() {
		System.out.println("walk in the ground");
		
	}

	public void run() {
		System.out.println("run in the ground");
		
	}

public static void main(String[] args) {
			Test1 obj=new Test1();
			obj.run();
			obj.walk();
		
			
	
	
}


}
