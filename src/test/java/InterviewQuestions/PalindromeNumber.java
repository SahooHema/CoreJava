package InterviewQuestions;

public class PalindromeNumber {


	public static void main(String[] args) {
		int num=121;int rev=0;int rem;int temp=num;
		while(temp!=0) {
			  rem=temp%10;//1
			  rev=rev*10+rem;//1
			  temp=temp/10;//21
		  }
		
if(num==rev) {
	System.out.println("palindrome number");
}
else {
	System.out.println("not palindrome number");
}
	
		
	
		
		

		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}}
/*
 * palindrome number: if we reverse original number , then also the number will be same..eg: 121..
 */













