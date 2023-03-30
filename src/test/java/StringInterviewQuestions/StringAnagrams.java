package StringInterviewQuestions;

import java.util.Arrays;

public class StringAnagrams {

	public static void main(String[] args) {
		
		String s1="hema";
		String s2="Haem";
		
	 s1= s1.toLowerCase();
  s2=s2.toLowerCase();
	if(s1.length()==s2.length()) {	
	char[] str1chararray=	s1.toCharArray();
	char[] str2chararray=	s2.toCharArray();
	
	Arrays.sort(str1chararray);
	Arrays.sort(str2chararray);
	boolean result= Arrays.equals(str1chararray, str2chararray);
	if(result) {
		System.out.println(s1 + " and " + s2 + " are equal ");
	}
	else {
		System.out.println(s1 + " and " + s2 + " are not equal ");
	}
	}
		
	
		
	
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
/*

String str1 = "scaler"; //scp=object created                         //Line1
String str2 = new String("scaler");   //one object //jvm refers it..  //Line2
str2.intern();                                       //Line 3
System.out.println(str1 == str2);





*/