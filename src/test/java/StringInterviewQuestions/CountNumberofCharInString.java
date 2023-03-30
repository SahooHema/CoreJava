package StringInterviewQuestions;

public class CountNumberofCharInString {

	public static void main(String[] args) {
		
//	//	String s="interview";
//		String s="java is object oriented language";
//		//System.out.println(ss.length());//32
//		
//		
//		int count=0;
//		
//		char ch='a';
//		
//		for(int i=0;i<s.length();i++) {
//			if(s.charAt(i)==ch) {
//				count++;
//			}
//		}
//		
//		
//		System.out.println(" the " + ch + " appears "  + " is "  + count);
//		
		
		
		String s="java is object orieneted language";
		
	int result=	s.length()-s.replaceAll("e", "").length();
		System.out.println(result);

	}

}
