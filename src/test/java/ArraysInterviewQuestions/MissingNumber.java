package ArraysInterviewQuestions;

public class MissingNumber {



	public static void main(String[] args) {
		
	//	int[] a= {1,3,5,4,8,6,2,10,7};
		int[] a= {1,2,4,5,7,10,9,3,6};//12
		
//		int sum1=0;
//		
//		for(int i=0;i<num.length;i++) {
//			sum1=sum1+num[i];
//		}
//		
//		System.out.println(sum1);//12
//		
//		
//		int sum2=0;
//		for(int i=1;i<=100;i++) {
//			sum2=sum2+i;
//		}
//		
//System.out.println(sum2);//15
//		
//		
//		System.out.println("mising number is:"+ (sum2-sum1));
//		
//		
//		
///////////////first meethod///////////////		
//		int sum=0;
//		
//		for(int i=0;i<a.length;i++) {
//			sum=sum+a[i];
//		}
//		
//		System.out.println(sum);//12
//		
//		
//		int expelmements=a.length+1;
//		int sum1= expelmements*(expelmements+1)/2;
//		System.out.println(sum1);//15
//		System.out.println("missing number:"+(sum1-sum));
		
/////////////////second method///////////////////		

	
		
	int xor1 = a[0];
		
		for(int i=1;i<a.length;i++) {
			xor1=xor1^a[i];
		}
		
		
		int xor2=1;
		
		for(int i=2;i<=10;i++) {
			xor2=xor2^i;
		}
		
		System.out.println("missing number:"+ (xor1^xor2));
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
/////////////////////third method///////////////////////////		

		/*
		 
		array should be in range
		not sorted
		not duplicate numbers 
	
second method:- using xor -> it consists of commutative and associative i.e. (a*b)*c=a*(b*c)	
		 */
	}

}
