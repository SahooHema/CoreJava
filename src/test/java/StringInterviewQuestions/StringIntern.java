package StringInterviewQuestions;

public class StringIntern {

	public static void main(String[] args) {
		String s1=new String("interiewbit").intern();//two object
		String s2=new String("interiewbit").intern();
		System.out.println(s1==s2);//true
		
		
		
		
		
		
		
		
		
		
		
		
//		String s="abc";
//		char[] c= new char[] {'a','b','c'};
//		System.out.println("stringpwd"+ s);
//	System.out.println("characterpassword"+ c);
		
//	System.out.println(s1.hashCode());	
//	System.out.println(s2.hashCode());	
//	System.out.println(s1.equals(s2));//true
//		
//	StringBuilder sb1=new StringBuilder("abc");
//	StringBuilder sb2=new StringBuilder("abc");
//
//	System.out.println(sb1.hashCode());
//	System.out.println(sb2.hashCode());
//	System.out.println(sb1.equals(sb2));//false
	}

}
/* 
intern() method will check object value in scp or not..if not it will assign object refernce to object value in scp..
eg: String s2=new String("interiewbit").intern();
two object created one in heap memory and other in scp but scp is handle by jvm not by object refernce ..that's why use intern() method..

hashcode() method can be used by string classs, not by stringbuilder,stringbuffer...
it check content and return same address..address handled by jvm..

object has equals () and hashcode()..

//why char array is prefeered over string?
 string always new object create ...
 char array easy to encryp and decrypt..
 
 //is String is thread safe?
  * yes, due to immutability , each object is using individual thread for execution
  any method if synchronized than  that uses the concept of multiple threading..
 

 
 
 
 
 */










