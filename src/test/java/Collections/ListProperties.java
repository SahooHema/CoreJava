package Collections;

import java.util.ArrayList;


import java.util.Iterator;
import java.util.List;

public class ListProperties {

	public static void main(String[] args) {
	
		List l=new ArrayList();
		l.add(0, "hema");
		l.add("sahoo");
		l.add(78);
		l.add(78);
		l.add(null);
		l.add(null);
	System.out.println(l);//[hema, sahoo, 78]
	System.out.println(l);//[hema, sahoo, 78, 78]//check duplicacy
	System.out.println(l);//[hema, sahoo, 78, 78, null, null]
	Iterator itr=	l.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next()); 
		}
//		output:-
////	hema
//		sahoo
//		78
//		78
//		null
//		null
	
		
		
		
		
		
		/*
List is an interface that inherit collection interface
It is an index based data structure i.e. it stores data based on index		 
It can store duplicate elements		 
It can store any no.of null values		 
It follow the insertion order i.e. the element which is inserted first will be retrieve first..		 
We can iterate(get) elements from the list by using iterator and list iterator		 
		 
		 
		 
		 */
		
		
		
		

	}

}
