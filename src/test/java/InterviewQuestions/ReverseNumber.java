package InterviewQuestions;

public class ReverseNumber {

	public static void main(String[] args) {
//	int num=5432;int rev=0; int rem ;
//	while(num!=0) {
//	rem=num%10;
//	rev=rev*10 +rem;
//	num=num/10;
//	}
//		
//	System.out.println(rev);	
		
		
	int num=5432;int rev=0;int rem;
	while(num!=0) {
	rem=num%10;
	rev=rev*10+rem;
	num=num/10;			
	}	
		
	System.out.println(rev);		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}

}



/*
How to find remainder :-divide number by 10, rem is 2.. 
take quotient as num and divide by 10; rem is 3,4,5..
% = gives remainder
/ = gives quotient

*/