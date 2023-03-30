package ArraysInterviewQuestions;

import java.util.ArrayList;

public class CountEvenAndOddNumber {

	public static void main(String[] args) {
		
		int[] a= {10,5,8,4,3,7};
		
		ArrayList<Integer> al1=new ArrayList<Integer>();
		
		ArrayList<Integer> al2=new ArrayList<Integer>();
		
		
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				al1.add(a[i]);
			}
			else {
				al2.add(a[i]);
			}
		}
		
		int total1=0;
		for(int no:al1) 			
		{ 
			total1=total1+no;
			System.out.println("even numbers are:" +no);
		}
		
	System.out.println("count of even numbers are:"+al1.size());
	System.out.println(total1);
	
	
	int total2=0;
		for(int no:al2) {
			total2=total2+no;
			System.out.println("odd numbers are:" +no);
		}
		
		System.out.println("count of odd numbers are:"+al2.size());
		System.out.println(total2);
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
