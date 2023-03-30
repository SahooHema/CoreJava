package StringConcepts;

public class EqualsCompareMethds {

	public static void main(String[] args) {
		
		
		String s1="hema";
		String s2="hema";
		String s3="sahoo";
		String s4="Hema";
		
		if(s1.equals(s2)==true) {
			System.out.println("s1 and s2 are equal ");
		}
		else {
			System.out.println(" not equal");
		}
		
		if(s1.equals(s3)==true) {
			System.out.println("s1 and s3 are equal ");
		}
		else {
			System.out.println(" not equal");
		}
		
		
		if(s1.equals(s4)==true) {
			System.out.println("s1 and s4 are equal ");
		}
		else {
			System.out.println(" not equal");
		}
		
		if(s2.equalsIgnoreCase(s4)==true) {
			System.out.println("s2 and s4 are equal ");
		}
		else {
			System.out.println(" not equal");
		}
		
		if(s1.equals("")) {
			System.out.println("s1 is empty");
		}
		else {
			System.out.println(" not empty");
		}
	//NOTE: s1.equals("").check string is empty or not..
		
///////////////////////////////////////////////////compareTo & comareToingorecase////////////////		
//Note: it compares two strings lexicographically means convert each character in strings in to unicode, if both strings are equal then it will give 0 else +ve or -ve value..		
// output is 0 then s1=s2, output is +ve then s1>s2, output is -ve then s1<s2..
//it return value in integer 	
//if results is not 0(s1-s2=!0) then it will not compare next character i.e. bc..
	
		String s5="a";
		String s6="A";				
		System.out.println(s5.compareTo(s6));//32
		
		String s7="A";
		String s8="a";			
		System.out.println(s7.compareTo(s8));//-32
		
		String s9="abc";
		String s10="Abc";
		
		System.out.println(s9.compareTo(s10));//32
		
		String s11="aBc";
		String s12="Abc";
		
		System.out.println(s11.compareTo(s12));//32
		
		
		String s13="aBc";
		String s14="Abc";
		
		System.out.println(s13.compareToIgnoreCase(s14));//0
		
		
	//Note: we can calculate length with compareTo()method
		
		String s113="hema";
		String s114="";
		
		System.out.println(s113.compareTo(s114));//length is 4...
		
		
	}

}
