package ArraysInterviewQuestions;

import java.util.HashMap;

import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElement {

	public static void main(String[] args) {
		
	

//		
//		
//		
//		
//		
//		
//		int[] a= {1,3,4,6,3,8,9,8};
//		
//		for(int i=0;i<a.length-1;i++) {
//			for(int j=i+1;j<a.length;j++) {
//				if(a[i]==a[j] & (i!=j)) {
//					System.out.println("duplicate elementis:"+a[j]);
//				}
//			}
		
///////////////////////////////////////////first method///////////////
//	
//		int[] a1= {3,5,4,3,2,2,1,3};
//		
//		Set<Integer> s=new HashSet<Integer>();
//		
//	   for(int no:a1) {
//		   if(s.add(no)==false) {
//		   System.out.println(no);
//		   }
//	   }
		
 ///////////////////////////////////////////second method///////////////		
		int[] a2= {3,5,4,3,2,2,1,3};
	   
		Map<Integer,Integer> hm=new HashMap<Integer,Integer>();
		
		for(int no: a2) {
		Integer count=hm.get(no);		
		if(count==null) {
			hm.put(no,1);
		}
		else {
			count=count+1;
			hm.put(no, count);
		}
		
		}
		
		Set<Map.Entry<Integer,Integer>> es=hm.entrySet();
		
		for(Map.Entry<Integer,Integer> me: es) {
			
			if(me.getValue()>1) {
				System.out.println(me.getKey());//2,3
			}
		}
		
	

		
	}	

	
		}

/*
1.Brute force method: 
takes more time due to which low performance..
not useful when there is more than 2 duplicate elements..

2.Set Interface
does not store duplicates elements
return true if element does not exist ..
not useful when there is more than 2 duplicate elements..

2.HashTable
it is a class under map interface
map stores data in the form of key(number) and value(count of no.s) pair
get method return value in integer format
entryset is subinterface of map interface




*/