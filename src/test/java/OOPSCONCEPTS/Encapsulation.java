 package OOPSCONCEPTS;

public class Encapsulation {
	
	private int empid;//data hiding
	
	
	public void set( int empid) {
		this.empid=empid;//modify
	}
	
	public int get() {
		return empid;//view
	}
	

	public static void main(String[] args) {
		
		Encapsulation obj=new Encapsulation();
	obj.set(20);
		System.out.println(obj.get());
		
		
		
	}

}
/*
Encapsulation: It define as wrapping of data(variables) and code acting on data(methods) together into a single unit. eg: medicene capsule, car engine..
we can acheive encapsulation :-
1. make variable private in class
2.use public getter and setter method to view variable valuessss and modify variable values
Data hiding: variables can be access by the class and its method inside it, it cannot be accessed outside the class..

Important Note:constructr, polymorphism, inheritance are code usability
encapsulation, interface, abstraction are code security















*/