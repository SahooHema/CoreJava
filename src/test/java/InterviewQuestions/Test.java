package InterviewQuestions;

public class Test {
	int a=1,b=1,c;
	public static void main(String[] args) {
Test obj=new Test();
obj.calFabi(10);
}	
		
	
		
		
public void  calFabi(int num) {
	if(num>=1) {	
	c=a+b;
	System.out.println(c);
	a=b;
	b=c;
	calFabi(num-1);
	
	}
}
}