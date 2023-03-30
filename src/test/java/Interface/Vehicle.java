package Interface;

public interface Vehicle {
	
	
	public void seat();
	
//	default void wheel() {
//		System.out.println("wheel is good");
//	}
//
//	
//  static void window() {
//		System.out.println("apply break");
//	}
  
}

/*
Interface:- can achieve 100% abstraction
Interface explains what to do but not how to do
cannot create object 
use implements keyword
declare method no body 
only public abstract type method allow in parent class
method overriding can achieve
Variable/fields can be final, static,public,private, protected
it supports multiple inheritance
It supports multiple inheritance
can achieve loose coupling
In java8, allow concrete method in parent class , access modifier is default with method body 
In java8, allow concrete method in parent class , access modifier is static with method body 
In java9, allow private methods
*/