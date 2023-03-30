package StringConcepts;

public class LengthEmptyTrimMethods {

	public static void main(String[] args) {
	
		String s2=null;
		String s1=" ";
String s=" hemasahoo ";

System.out.println(s1.length());
	System.out.println(s.length());
	System.out.println(s2.length());//o/p:- null pointer exception
	
	///////////////////////////////////isEmpty methods//////////////////
	
	System.out.println(s2.isEmpty());//o/p:- null pointer exception
	System.out.println(s.isEmpty());
	System.out.println(s1.isEmpty());
	
//////////////////////////////////////trim methods/////////////////	
	
	System.out.println(s2.trim());
	System.out.println(s.trim());
	System.out.println(s1.trim().length());
	
	if(s1.trim().length()==0) {
		System.out.println("s1 is empty");
	}
	System.out.println("not empty");
		
		
		

		
		
		
		
		
		

	}

}
 