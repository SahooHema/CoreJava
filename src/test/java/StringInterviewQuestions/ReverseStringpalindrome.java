package StringInterviewQuestions;

public class ReverseStringpalindrome {

	public static void main(String[] args) {
		
		String s="madam";
		String rev="";
		int l=s.length();
				for(int i=l-1;i>=0;i--) {
		rev=rev+s.charAt(i);
		}
				
	if(s.equals(rev)) {
		System.out.println("palindrome string");
	}
	else {
		System.out.println("not palindrome");
	}
		

		
		
		
		
		
		
		
		
}
}