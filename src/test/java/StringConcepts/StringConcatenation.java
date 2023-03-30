 package StringConcepts;

public class StringConcatenation {

	public static void main(String[] args) {
		String s1="hema";
		String s2="rahul";
		
		System.out.println(s1+s2);
System.out.println(s1+10+s2);//hema10rahul
System.out.println(s1+10+20);//hema1020
System.out.println(10+20+s1);//30hema
System.out.println(s1+20/10);//hema2 by using BODMAS 
//System.out.println(s1+10-5);//compiler error
System.out.println(s1.concat(s2));//hemarahul
//Note: + and concat method are same..+ is used as concat operator in string

//////////////////////////////////////Joins///////////////////////
//It is static method
//It is called with String class uses delimiter and elements..
//If delimiter is null, it will throw null pointer exception..but if element is null, not throw exception..
//joins and concat method return string value..
System.out.println(String.join(",", s1,s2));//hema;rahul
System.out.println(String.join(";",null,s2));//null;rahul
System.out.println(String.join(null,s1,s2));//nullpointerexception

////////////////////////////////////////////Subsequence & Substring
//subsequence :- It returns charsequence.. starts with specified index and ends with end-1 index..
//substring:- it returns string.

String s="this demo";

System.out.println(s.subSequence(2, 7));

System.out.println(s.substring(3));
System.out.println(s.substring(1, 9));
System.out.println(s.substring(1, 10));//stringIndexOutOfBoundException of length 9
System.out.println(s.substring(0, 0));//empty string
System.out.println(s.substring(3, -1));//stringIndexOutOfBoundException of length 9









	}

}
