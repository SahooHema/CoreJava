package StringConcepts;

public class CaseConversionTypeConcersion {

	public static void main(String[] args) {
		
		String s="HemaSahoo";
		String s1="hEMAsahOO";
		System.out.println(s.toUpperCase());//HEMASAHOO
		System.out.println(s1.toLowerCase());//hemasahoo
//Note:-Case conversion
		
		int a=10;
	String s2=	String.valueOf(a);
		System.out.println(a);
//Note:ValueOf() :- It is static method thats why directly call with string class		
		
	
char[] c= s.toCharArray();
		System.out.println(c);
		
//Note:-Type conversion		
		
		
		
		

	}

}
