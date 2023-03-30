 package StringConcepts;

public class Stringdefinition {
	
	
	
	public static void main(String[] args) {
	
//		String s="hema";
//		System.out.println(s);
//		String s1="sahoo";
//		System.out.println(s1);
		

		
		String s="hema";
		
	
System.out.println("Character password: " + s );
	
	
	
//char[] c= {'i','j','k','l'};
//	String s1=new String(c);
//	String s11="hema";
	
//	public final class String extends Object implements CharSequence,Searilzable,Comparable
//	
//	String s2=new String("hema");
//	String s23=new String("rahul");
//	String s24=new String("hema");
//	String s5= "hema";
//	String s6="hema";
//	
	
	/*
It is non primitive datatype i.e. size is not fixed
it is sequence of characters or array of characters.
eg: 
char[] c= {'i','j','k','l'};
	String s=new String(c);
it is also called CharSequence which is an interface which represents sequence of characters
it is a class
syntax:-
public final class String extends Object implements CharSequence,Searilzable,Comparable
can create object of String class and it is of 2 types which is shown below:-
String s=new String();
String s="hema";
String object is immutable
What is difference between String s=new String(); & String s="hema";
to create string we have 3 classes :-
String,StringBuilder,StringBuffer

//////////////////////////////////////////////
StringConstantPool or StringLiteralPool
It is an area in heap memory where java store string objects values
String s=new String("hema");
hema value stores in heap memory and in scp (coz literals also created and it store value in scp).for literal values "JVM" internally created object references
two objects created
String s="sahoo";
sahoo stores in scp & only one object is created. "s" is object refernce  pointing to "sahoo" 
Literals means fixed value
Note: Always use "one object concept for string" coz project will not get heavy...it is good practicle as well..
SCP does not allow garbage collection coz jvm intenally points to refernce variable..        
/////////////////////////////////////////////
Examples for SCP or SLP:-
String s2=new String("hema");
	String s23=new String("rahul");
	String s24=new String("hema");

Note:first time, s2 refers hema value stores in heap memory and scp.. but in second time, s24 refers hema values stores in only heap memory not in scp..

String s23=new String("rahul");
two objects created

String s24=new String("hema");
only one object created

String s5= "hema";
String s6="hema";
No object is created coz "hema" is already present in scp. Now hema which was handled by "JVM" , will be handled by s5.
s6 ->no object is created and now s6 also points to the hema value..
//////////////////////////////////////////////
Why String is immutable?
Immutable means unchangeable .Once string object is created, we cannot change the object value..
eg: 	String s=new String("hema");
		s.concat("sahoo");
		System.out.println(s);//output : hema
In this eg..we cannot change the original value with new value.. 
we can create new object value i.e. hema sahoo  which can store in heap memory and sahoo value in scp in case this value is not present..
	
eg:-	String s=new String("hema");
	String s1=s.concat("girl");
		System.out.println(s1);
In this case, if object reference is different then output will be "hemagirl"..

eg: 
String s1="hema";
String s2="hema";
String s3="hema" changed to "sahoo"
Note: now, s1,2,s3 will point to hema but if s3 value changed from "hema" to"sahoo",then all values will be affected so in order to reduce that...that's why it is immutable
Now, need to create new object value..i.e. String s3="sahoo".. 

////////////////////////////////////////////////
 Why string class is final ?
 Coz string has many properties i.e. scp,memory maagement(2 object references has value same, then it will point to one value only), security(n/w connection, database-use url, pwd, username in form of strings),immutability,synchrinization,+ operators(use + operator to combine strings),class loading(class loaded with string args) 
 which other java class has not , they should not inherit the properties of it..that's why it is declared final..
 Other java class cannot modify it..
 
 If class is declared final, that cannot be extended..
 If method is declared final but class is not declared final, so class can be extended but methods cannot be oveeride
 If varaibale is declared final , that var value cannot be changed
 
 Difference between final and immutability?
 immutability works for strings object values..
 final works for variables, methods and class
eg:-
   final	StringBuffer sb=new StringBuffer("hema");
	sb=	sb.append("sahoo");
 note: final cannot be reassigned
 
 eg:-
 StringBuffer sb=new StringBuffer("hema");
	sb=	sb.append("sahoo");
	System.out.println(sb);
 Immutable can be reassigned
 
 ////////////////////////////////////////////////
 What is difference between == & equals method?
 
 == :-     it is used for object reference comparison , it is point to same memory allocation
 
 EXAMPLE:-
 String s=new String("hema");
	String s1=new String("hema");
	if(s==s1) {
		System.out.println("true");
	}
	else {
		System.out.println("not equals");
	}
	}//false
	
 equals :- it is used for object content comparison, it check object values..
 
 EXAMPLE:-
 String s=new String("hema");
	String s1=new String("hema");
	if(s.equals(s1)) {
		System.out.println("true");
	}
	else {
		System.out.println("not equals");
	}
	}//true
 
 
 String s1="hema";
	String s2="hema";
	System.out.println(s1==s2); //true

Note:Object class has equals methods in which "==" & ".equals()" methods are same
////////////////////////////////////////////
 String class constructors?
 types of cons:- no args, string cons, stringbuilder, stringbuffer, char array[]. byte[] array
 eg:-
 	StringBuilder stb=new StringBuilder("sahoo");//mutableobjects
		StringBuffer sb=new StringBuffer("hema");//mutableobjects
	String s=new String(stb);
System.out.println(s);
 
 eg:-
 	byte[] b= {101,102};
	String s=new String(b);
System.out.println(s);//ef in the form of characters
 
 eg:-
 	char[] c= {'a','b'};
	String s=new String(c);
System.out.println(s);//ab create string 

Why char array is preferred over string to store password?

 String objects are immutable, scp refers to reuseability of object values, garbacge collection also not allowed.. anybody can access the values.. 
 Array values can be deleted after use of it.modify array with anytype..even before garbage collection.. so for security reason array is good..
 
 
 	char[] pwd=new char[] {'a','b'};	
System.out.println("Character password: " + pwd );	
 
 o/p:- Character password: [C@53bd815b
 
 
 
 
 String s="ab";
System.out.println("string: " + s );

 o/p:- Character password: ab
 
 
 
 
 
 
 
 













	 */
	}
}
