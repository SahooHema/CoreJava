package SearchAlgorithm;

public class BinarySearch {

	public static void main(String[] args) {

		int[] a= {2,5,7,9,12,14,16,17,19,20,24,28};
		
		int search=12;
		int li=0;
		int hi=a.length-1;
		int mi=(li+hi)/2;
				System.out.println(mi);//fourth index value is 7
		
				while(li<=hi) {
					 
		if(a[mi]==search)  
		{
			System.out.println("element is at "+mi+" index postion");
			break;
		}
		         //7<9
		else if(a[mi]<search) {
			
			li=mi+1;//5
		}
		else {
			hi=mi-1;//3
		}
		
		mi=(li+hi)/2;//4
		
//		System.out.println(mi);//9
		
	}
			System.out.println("elment is at "+mi+" index position");	
	
	}

}
/*
Binary search:- the list should be sorted














*/