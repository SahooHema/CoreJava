package SortingAlogrithm;

public class InsertionSort {

	public static void main(String[] args) {
	           // 0 1 2 3 4 5
		int[] a= {5,1,6,2,4,3};
		
		//int[] temp= {};//j represents temp index;
		
		for(int i=1;i<a.length;i++) {
			int temp=a[i];//1,2,3,4
			int j=i;//1,2,3,4
		while(j>0 && a[j-1]>temp) {	 
			a[j]=a[j-1];
			j=j-1;//0
			
		}
			a[j]=temp;//a[0]=temp
		}
		 
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
	}
		
	
	}

}
/*
Insertion sorting:- we pick one element and place in its  position i.e. ascending or descending..
It is useful when sort less no.of element list..
merge,quick,heap sort is faster than insertion sort..

int [] temp= {5,1,6,2,4,3};














*/