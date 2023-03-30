package Inheritance;

public class Bird extends Dog{

	public void fly() {
		System.out.println("bird fly");
	}

public static void main(String[] args) {
		
	Bird obj=new Bird();
	obj.fly();
	obj.eat1();
	obj.eat();
	}
}
//eg: multilevel inheritance



//public class Bird extends Animal{
//
//	public void fly() {
//		System.out.println("bird fly");
//	}
//
//public static void main(String[] args) {
//		
//	Bird obj=new Bird();
//	obj.fly();
//	obj.eat();
//	}
//	
//	
//	
//}
//eg: hierarchical inheritance