package DynamicPolymrophism;



public class B extends A{

 public void show() throws RuntimeException {
       super.show();
		System.out.println("test B");
	}
	
	
	
	

	public static void main(String[] args) {
	B obj=new B();
	obj.show();
	}}
	
//	String show() {
//	System.out.println("show B");
//	return null;
//	
//	}
//		public static void main(String[] args) {
//			B obj=new B();
//			obj.show();
//	
//			A obj1=new A();
//			obj1.show();
//	}
//
//}
/*
Note:- In method overriding concept, do return type occur?
yes, in 4.0 version, both parent and child method should have same return type..
yes, from java 5.0  version , in B class, method  return type is child of parent class A. i.e. String B(), Object A().it is called covariant returntype 
EG:-
public class A {


	
	Object show() {
		System.out.println("show A");
		return null;
	}
	
	public class B {
	
	
String show() {
	System.out.println("show B");
	return null;
	
	}
		public static void main(String[] args) {
			B obj=new B();
			obj.show();
			
	        A obj1=new A();
			obj1.show();

	}

OUTPUT:- show B
Note: Access-modifiers -> child class method access modifier should be greater than parent class method access modifier eg:-
1.
public class A {
	
	 void show() {
		System.out.println("test A");
	}

public void show() {
		System.out.println("test B");
	}
//public modifier	
2.	
	
protected void show() {
		System.out.println("test A");
	}

public void show() {
		System.out.println("test B");
	}
note: protected modifier	
3.	
	
	 void show() {
		System.out.println("test A");
	}

public void show() {
		System.out.println("test B");
	}
note:default modifier
//override and exception handling
 
 1. If parent class exception does not throws exception, then subclass exception should throws unchecked exception.or else does not throw any exception..otherwise, it will throw compiler error..
 public class A {


	
	public void show() {
		System.out.println("test A");
	}
	
 
 public class B extends A{

 public void show() throws ArithmeticException {
		System.out.println("test B");
	}
	
	
	
	

	public static void main(String[] args) {
	B obj=new B();
	obj.show();
	}}
	
 2. If parent class exception throws exception, then subclass exception should same exception. otherwise, it will throw compiler error..
 
 public class A {


	
	public void show() throws ArithmeticException{
		System.out.println("test A");
	}
	
 
 public class B extends A{

 public void show() throws ArithmeticException {
		System.out.println("test B");
	}
	
	
	
	

	public static void main(String[] args) {
	B obj=new B();
	obj.show();
	}}

//method override and abstract:-
 need to use abstract keyword before class 
 declare abstarct keyword in method in parent class
 need to override parent class method in child class method and implement it
 does not create object of abstract class
 use extends keyword 
 
  
 //method override and interface:-
create interface class 
 declare  method in parent class and no body to it
 need to override parent class method in child class method and implement it
 does not create object of abstract class
 use implements keyword 
 
//invoking overridden method from subclass 
 using super keyword
 EG:- 
 public class B extends A{

 public void show() throws RuntimeException {
	 super.show();
		System.out.println("test B");
	}
 
 //Which methods cannot override?
  private: visibility errorsss
  final: change modifiers
  static:change modifier
 
 //Does synchronized modifier override?
  using synchronized keyword : if synchronized keyword is used in private method, it will work..
 
 
 
 
 
 
 
 */












