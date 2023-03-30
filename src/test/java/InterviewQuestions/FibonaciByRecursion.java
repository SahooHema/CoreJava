package InterviewQuestions;

public class FibonaciByRecursion {
	static int a=1,b=1;int c;
	
	public static void main(String[] args) {
		FibonaciByRecursion obj=new FibonaciByRecursion();
		obj.fibonaci(10);

	}

	
	
	
	public void fibonaci(int num) {
		if(num>=1) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			fibonaci(num-1);
		}
	
	}
	
	
	
}
