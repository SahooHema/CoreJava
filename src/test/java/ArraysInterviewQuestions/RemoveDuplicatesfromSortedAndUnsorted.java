package ArraysInterviewQuestions;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicatesfromSortedAndUnsorted {

	public static void main(String[] args) {
//     	int[] a= {1,2,2,3,4,5,5};
//		
//		int[] temp=new int[a.length];
//		int j=0;
//		
//		for(int i=0;i<a.length-1;i++) {
//			if(a[i]!=a[i+1]) {
//				temp[j]=a[i];
//				j++;
//			}
//		}
//		
//		temp[j]=a[a.length-1];
//		
//		for(int k=0;k<temp.length;k++) {
//			System.out.println(temp[k]);
//		}
	////////////////////////SortedArray//////////////////////////	
		
		HashSet<Integer> hs=new HashSet<Integer>();
		int[] s= {1,2,2,3,4,5,5};
		
		for(int i=0;i<s.length;i++) {
			hs.add(s[i]);
		}
		for(int no:hs) {
			System.out.println("sorted removed duplicates list:"+no);
		}
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//////////////////////////////sorted array by using hashset/////////////////////////	
//		int[] s1= {1,3,2,5,4,2,3};
//		HashSet<Integer> hs1=new HashSet<>();
//		
//		
//		for(int i=0;i<s1.length;i++) {
//			hs1.add(s1[i]);
//		}
//		for(int no:hs1) {
//			System.out.println("sorted removed duplicates list:"+no);
//		}
		
//////////////////////////////unsorted array by using hashset/////////////////////////			
		
	
		

	}

}
/*
Preferred by using HashSet: coz it is applicable for removing duplicates from sorted and unsorted arrays..


 */



