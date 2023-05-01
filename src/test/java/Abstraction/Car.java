package Abstraction;

public class Car extends Vehicle{


	@Override
	void Break() {
		System.out.println("apply break");
		
	}


	
	
	
	public static void main(String[] args) {

		Car obj=new Car();
		obj.Break();
		obj.sterringWheel();

	}


}
