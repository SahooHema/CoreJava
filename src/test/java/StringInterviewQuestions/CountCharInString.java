package StringInterviewQuestions;

public class CountCharInString {

	public static void main(String[] args) {
		
//		String s="this is hema sahoo";//15
//		int count=0;
//		for(int i=0;i<s.length();i++) {
//			if(s.charAt(i)!=' ') {
//				count++;
//			}
//		}
//		System.out.println(count);//15
		
		String s="this is hema";
		
		int count=0;
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				count++;
			}
		}
		
		System.out.println(count);
		
		
		
		
		
		
	}

}

//note:- in characters does not count space in string