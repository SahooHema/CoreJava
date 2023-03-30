package InterviewQuestions;

public class FactorialByRecursion {
int num=5,fact=1;
	public static void main(String[] args) {

		FactorialByRecursion obj=new FactorialByRecursion();
int res= obj.fact(5);
System.out.println(res);

	}
	
	public int fact(int num) {
		if(num>1) {
			fact=fact*num;
			fact(num-1);
		}
	     return fact;

	
	
	
	
	
	}
	
	
	
	
}

//recursion means calling your method again and again

//