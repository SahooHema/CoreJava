package SortingAlogrithm;

public class BubbleSort {

	public static void main(String[] args) {

		int[] a= {36,19,29,12,5};
		

		int temp;
		for(int i=0;i<a.length;i++) {
			int flag=0;
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					flag=1;
				}
			}
			if(flag==0)	{
				break;
			}
				
		
			}
		
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]+" ");
	}
			
		}
	

	
	
	
	
	
	
	
		

//////////////////////////////////////////////////////////////

//String[] s= {"hema","rahul","mummy","sana","himanshi"};
//		
//
//		String temp;
//		for(int i=0;i<s.length;i++) {
//			int flag=0;
//			for(int j=0;j<s.length-1-i;j++) {
//				if(s[j].compareTo(s[j+1])>0) {
//					temp=s[j];
//					s[j]=s[j+1];
//					s[j+1]=temp;
//					flag=1;
//				}
//			}
//			if(flag==0)	{
//				break;
//			}
//				
//		
//			}
//		
//	for(int i=0;i<s.length;i++) {
//		System.out.println(s[i]+" ");
//	}
//			
//		}
//		
//		
//		
//	}	


//
//














	}

	
	




/*
Bubble sort:- first, it will compare each pair of adjacent elements and then swapping in sorted order..
flag variable tells program condition is met..result is true or false..
Note:useful for String and Integer values..











*/