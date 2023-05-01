package ArraysInterviewQuestions;

import java.util.HashSet;

import DynamicPolymrophism.A;

public class FirstDuplicateElement {

	public static void main(String[] args) {
		
//		int[] a= {3,5,4,3,2,2,1,3};
//		int temp=0;
//		for(int i=0;i<=a.length-1;i++) {
//			for(int j=i+1;j<a.length;j++) {
//				break;
//				}
//				if(a[i]==a[j]) {
//					System.out.println("first duplicate element:"+a[j]);
//					temp=temp+1;
//				}
//			if(temp>0) {
//				break;
//			}
//			
//			
//		}
		
///////////////////////////////////first method/////////////////////////
		int[] a= {3,5,4,3,2,2,1,3};
		
		int temp=-1;//used coz in array no index position with -1
	HashSet<Integer> hs=new HashSet<Integer>();
		
	for(int i=a.length-1;i>=0;i--) {
		if(hs.contains(a[i])) {
			temp=i;//0 "as soon as duplicate value find replace temp with "i"th index value"
		}
		else {
			hs.add(a[i]);//3/1/2/4/5
		}
	}
		
		if(temp!=-1) {
			System.out.println(a[temp]);//3
		}
		
	

		
		
		
		
		
		
		
		
		
		
		
		
	
	/*	
1.BruteforceMethod: 	 
	 
2.HashSet:store data in table form	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 */
		
		
		
		
		
		

	}

}
