package Interface;

public class Car implements Vehicle,Vehicle1{

	
 public void seat() {
		System.out.println("check seat");
		
	}
	
	
	

	public void gate() {
		System.out.println("big gate");
		
	}
	



	public static void main(String[] args) {
		Car obj=new Car();
		obj.seat();
	//	obj.wheel();
		obj.gate();
		}
	}








	
	

