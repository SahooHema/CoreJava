package StringInterviewQuestions;

public class ConvertStringToStringBuilder {

	public static void main(String[] args) {
		
//		String s="this is hema sahoo";
//		StringBuilder sb=new StringBuilder();
//		sb.append(s);
//		System.out.println(sb);
		
		String[] str= {"hema","sahoo"};
		
		StringBuilder sb=new StringBuilder();
		sb.append(str[0]);
		sb.append(str[1]);
		System.out.println(sb.toString());//using append method 
		
		
//toconvertstringbuildertostring using tostring();
		
		String singlestring=sb.toString();
		System.out.println(singlestring);
		
		
		
		
		
		
		

	}

}
