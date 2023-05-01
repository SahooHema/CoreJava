package OOPSCONCEPTS;

public class Constructor {

	int employee_id;
	String name;
	
	
	public Constructor(int employee_id, String name) {
		this.name=name;
		this.employee_id=employee_id;
	}
	
	
	
	
	
	
	public static void main(String[] args) {

		Constructor bj=new Constructor(12,"hema");
	}

}
//Object created:- Constructor bj=new Constructor();
//when object created default constructor called
//constructor has same name as class name
//types: default(no arguments), no arguments(user defined), paramertized constructor
//Cons is use to initialize objects variable
//Cons has no return type
// Cons can be public,private, default, protected
//note: small talk is pure object oriented programming language;