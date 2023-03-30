package Inheritance;

public class Dog extends Animal{
	
	public void eat1() {
		System.out.println("dog eating");
	}
	
	public void eat() {
		System.out.println("dfdf");
	}

	public static void main(String[] args) {
		
		Dog obj=new Dog();
		obj.eat();
      	obj.eat1();
	}

}
//eg: single inheritance












//inheritance-> it is defined as to inherit the properties of parent class into the child class
//using extends class
//it is an IS-A relationship i.e. Dog IS-A Animal
//Advantages:- 
//code reuseability i.e. method can be used again and again in different class
//we can achieve polymorphism using inheritance
//Disadvantages:- it is tightly coupled i.e. if changes in methods in parent class then it will effect in child  classes 
//Types:- single: A->B, multilevel: A->B->C, herirarchical: Properties of A goes to B & c , multiple: properties of B&C goes to A, hybrid-> combination of any two types
//note: multiple inheritance cannot achieve by inheritance.. Interface concept need to use..
// method overloading cannot achieve by inheritance(this is called ambiguity error)..interface concept will use..
//note: constructor, private method cannot in inheritance
//note:-object class is super class of all the classes. there can be only one superclass...
 //note: in "HAS-A"(Association) relationship(new keyword is used) not using extends keyword instead create parent object in child class call methods as per use..
//note: in "HAS-A"(Association) relationship, it is not tightly coupled..
//Association has 2 types mentioned below:-
//Aggregation-> class has weak bonding eg:- car has music player..
//Composition-> class has strong bonding eg:- car has engine.. 

