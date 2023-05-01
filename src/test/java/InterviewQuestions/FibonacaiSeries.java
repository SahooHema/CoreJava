package InterviewQuestions;

public class FibonacaiSeries {

	int a=1;int b=1; int c;
	public static void main(String[] args) {
		
	
		int a=1,b=1;int c;
	for(int i=1;i<=10;i++) {
		 c=a+b;
		 System.out.println(c);//2
		a=b;//1
		b=c;//2
	}
	
	}

}
