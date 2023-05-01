package CompilePolymorphism;
/*
 * compiletime polymorphism
 * 
 */
public class Test {

	public void show() {
		System.out.println("show test");
	}
	
	
	
	
	public void show(int a) {
		System.out.println(a);
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Test obj=new Test();
		obj.show(10);
		obj.show();		
	
	
	
//	public static void main(String[] args) {
//	
//		System.out.println("1");
//		main(20);	
//		}
//	
//	public static void main(int a) {
//		
//		System.out.println("2");}
//note: main method can be overloaded coz JVM calls main method only
		

//		public void run(Object a) {
//			System.out.println("show testing");
//		}
//		
//		
//		
//		
//		public void run(String a) {
//			System.out.println("show test");
//		}
//		
//		
//		public static void main(String[] args) {
//			Test obj=new Test();
//			obj.run('a');	
//note: it is calling object argument coz "object" is superclass of all the classes... "object" is parent of String class"...		
			
		
//		
//		public void run(StringBuffer a) {
//		System.out.println("show testing");
//	}
//	
//	
//	
//	
//	public void run(String a) {
//		System.out.println("show test");
//	}
//	
//	
//	public static void main(String[] args) {
//		Test obj=new Test();
//		obj.run("abc");
//		obj.run(new StringBuffer("def"));
//note: in order to call stringBuffer need to use "new" keyword..otherwise it will call string only..		
		

//		public void show(StringBuffer a) {
//			System.out.println("show test");
//		}
//		
//		
//		
//		
//		public void show(String a) {
//			System.out.println("show test");
//		}
//		
//		
//		
//		
//		
//		
//		
//		public static void main(String[] args) {
//			Test obj=new Test();
//			obj.show(null);		
//note:compiler confuse which show method to call. ambiguous error..		
		
		
	
		
		
		
}
}



/*
 * polymorhpism: many forms eg: shape-> circle, traingle, pyramid
Types of polymorphism :-
compile time:- it is also c/d static polym.through method overloading can achieve this. compiler handle this..
run time:- it is c/d dynamic polym.through method overriding can achieve this..JVM handle this..
method overloading:- it has same class, name, different types of arguments: no. of arguments, types of args, sequence of args..
note: ambiguity error occurs in method overloading
method overriding:- it has same name, different class, same arguments, inheritance(IS-A)..
//Automatic promotion: when particular datatype not found , it is promoted to another datatype.. eg: char to int & int to float, long, double..
//Automatic promotion:if method has more than one argument it will not allow Automatic promotion. check below :-

eg: 		public void show(int a, float b) {
			System.out.println("show test");
		}
		
		
		
		
		public void show(float a, int b) {
			System.out.println("show test");
		}


	public static void main(String[] args) {
				Test obj=new Test();
				obj.show(10,20);	
		
		
	
	
	----------------***************---------------
	public void show(String a, float b) {
			System.out.println("show testng");
		}
		
		
		
		
		public void show(float a, int b) {
			System.out.println("show test");
		}


	public static void main(String[] args) {
				Test obj=new Test();
				obj.show("abc",20);	
		
//note: in this case it will work
//Varargs:-it will work only if method overload is present .it accepts multiple arguments or no arguments. check below..

public void show(int a) {
			System.out.println("show testng");
		}
		
		
		
		
		public void show(int...a) {
			System.out.println("show test");
		}


	public static void main(String[] args) {
				Test obj=new Test();
				obj.show(10,20);	


////////////////////////////////////////

		public void show(int a) {
			System.out.println("show testng");
		}
		
		
		
		
		public void show(int...a) {
			System.out.println("show test");
		}


	public static void main(String[] args) {
				Test obj=new Test();
				obj.show();	















*/