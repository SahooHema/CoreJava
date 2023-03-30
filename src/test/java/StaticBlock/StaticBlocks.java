package StaticBlock;

public class StaticBlocks {
static int a;
	static {
		System.out.println("hello");
	}
	
	
	static {
		a=10;
	}
	

	
	
	
	public static void main(String[] args) {
		System.out.println("hello world");
}

	static {
		System.out.println("objective c is pure oop");
	}
	
	
}

//output:-
//hello
//hello world

//Output:-
//hello
//java is oop
//objective c is pure oop
//hello world



/*
static block executed automatically when class is loaded in memory
Interview Question:- can we call static block without main method ?
Ans:- yes, but if we have jdk 1.6 version and previous version but after 1.6 version we cannot call static block without main method.
Note:- if we define main method, then also first static block will be executed then main method will get executed..
We can create multiple static block but it will be executed sequentially

What is the use of static block?
In, static block we can write native method the code of which  is written in different language
In static block, we only write methods that we want to load at the class time
It is used to initialize static variable i.e 
static{ a=10;}
*/