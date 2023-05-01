package Collections;

import java.util.HashSet;


import java.util.Iterator;
import java.util.Set;

public class SetPorperties {

	public static void main(String[] args) {
	
		Set s= new HashSet();
		s.add("sumit");
		s.add("rahul");
		s.add(100);
		s.add(9);
		s.add("rahul");
		s.add(null);
		s.add(null);
//		System.out.println(s);//[rahul, 100, 9, sumit]
//		System.out.println(s);//[rahul, 100, 9, sumit] check duplicacy
//		System.out.println(s);//[null, rahul, 100, 9, sumit]
		Iterator itr=	s.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());	
		}
//		output:-
//		null
//		rahul
//		100
//		9
//		sumit
		
		
		
		
		
		
		
		
		
		
		
	/*
	 Set is an interface that inherit collection interface
	 It stores data according to the hash code values(hash code means every object has unique integer value)	
	 It does not allow to  store duplicate elements	
	 It can store only one null value		
	 It does not follow the insertion order i.e. the element is stored in hash code values			
	 We can iterate(get) elements from the set by using iterator	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
Note: interview questions-> Difference b/w set and list?
	 */
		
	}

}
