package SortingAlogrithm;

public class SelectionSort {

	public static void main(String[] args) {
		
		
	
		int[] a= {38,52,9,18,6,62,13};
		int min;int temp=0;
		for(int i=0;i<a.length;i++) {
			min=i;//index position
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[min]) {
				min=j;//4th index
				}
			}
			
			temp=a[i];//0
			a[i]=a[min];//means in 0th index  4th index value will be placed 
			a[min]=temp;// means in 4th index, 0th index value will be placed
			
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.println("the sorted list is:"+a[i]+" ");//output:- 
		}
		
		
	
		
		
		
		
		
	/*	
		
	min=2-4
	temp=0
	j=1-2-3-4-5-6
	a[j]<a[min]
	52<	38
	9<38
	18<9
	6<9
	62<9
	13<9
	i.e.
	min=4
	temp=0
	j=4	
		
	temp=a[i]//38
	a[i]=a[min]//6
	a[min]=temp//38		
		
	*/	
		
		
		
		
		
		
	/////////////////////////////////////////

		
//		
//		String[] s= {"hema","ishita","rahul","sir","mummy","preetam","rani"};
//		
//	int min1;String temp1="";
//		for(int i=0;i<s.length;i++) {
//			min1=i;
//			for(int j=i+1;j<s.length;j++) {
//				if(s[j].compareTo(s[min1])<0) {
//				min1=j;//4
//				}
//			}
//			
//			temp1=s[i];//0
//			s[i]=s[min1];//means in 0th index  4th index value will be placed 
//			s[min1]=temp1;// means in 4th index, 0th index value will be placed
//			
//		}
//		
//		for(int i=0;i<s.length;i++) {
//			System.out.println("the sorted list is:"+s[i]+" ");//output:- 
//		}
	

	}

}
/*
Selection sort: combination of searching and sorting
check smallest element and put in beginning and repeat this process, until all elements are sorted..
Applicable for string and integer array..










*/