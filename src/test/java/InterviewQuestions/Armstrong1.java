package InterviewQuestions;

public class Armstrong1 {

	public static void main(String[] args) {
		
	 int num=153;int t1=num;int length=0; 
	 
	 while(t1!=0) {
		 length=length+1;
		 t1=t1/10;
	 }

	 int t2=num;int rem;int arms=0; 
	  while(t2!=0) {
		  int multi=1;
		  rem=t2%10;//3
		  for(int i=1;i<=length;i++) {
			  multi=multi*rem;//27
			  }
		  arms=arms+multi;//27int multi=1int multi=1
		  t2=t2/10;
	  }

	  
	 if(arms==num) {
		 System.out.println("armstrong number");
	 }
	 else {
		 System.out.println("not armstrong");
	 }
	}
	}


















/*

Armstrong number: it is depend upon no.of digits in number..eg: orignal number 12- there are 2 digits so the power will be 2 and add 1+4=8 .after adding number the result will be original number..
eg: 0,1,153..
153/10=3
arm=arm+(rem)^3=1+27=28
53/10=5
arm=28+125=
//steps to solve program:-
 1.find length
 2.reverse number with loop
 3.write int multi=1 inside loop
 */
