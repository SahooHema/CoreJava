package Collections;

import java.util.Stack;

public class StackPropertiesAndMethods {

	public static void main(String[] args) {
		
		Stack s=new Stack();
		
		s.push("hema");
		s.push(12);
		s.push(10.1);
		
		System.out.println(s);//[hema, 12, 10.1]
		System.out.println(s.pop());//10.1
		System.out.println(s);//[hema, 12]
		System.out.println(s.peek());//10.1
		System.out.println(s);//[hema, 12, 10.1]
		System.out.println(s.search(12));//2
		System.out.println(s.search("rahul"));//-1
		System.out.println(s.empty());//false
	

		/*
	1. It is legacy class, introduced in jdk 1.0version	 
	2.It is child class of vector class
	3.It is present in java.util packaage	 
	syntax: class Stack extends Vector	 
		 
	Properties:-
	it was designed based on LIFO(last in first out)
	it has methods i.e. push,pop(to take out top most element from the stack),peak(can only view top most element cannot take out from stack)	 
	it can be implemented on the basis of arrays,arrays list,linked list and vector	 
	it is index based Data Structure	
	we can store different types of data 
	
	Methods and constructor:-
	
	Stack();//default const with no args
	
	pop();-> remove top most element and return type is object 
	push();-> push el (push object)
	peak();-> see top most el and return el but not remove from the stack
	search(); :-> object index value return and if search el that is not present in stack, it will return -1
	empty(); :-> check stack empty or not
		 
	eg:- Array, int [] a={10,20,30};	 
	30-> top element
	10-> bottom el	 
		 
	eg:- In linked list,  int [] a={10,20,30};	
	10->top el
	30->bottom el	 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 */

	}

}
