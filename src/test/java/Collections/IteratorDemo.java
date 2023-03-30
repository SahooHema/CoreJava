package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorDemo {

	public static void main(String[] args) {
		
		List l=new ArrayList();
		l.add("hema");
		l.add(20);//collection object
		
		Iterator  itr =l.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());	
		}
		//output:-
		//hema
		//20
		
		l.remove("hema");
		System.out.println(l);//[20]
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 
		 List return object but if we want to retrieve value one by one need to use CURSOR
		 Cursor is of 3 types:- 1.iterator,list iterator,enumeration
		 ITERATOR:-
		 we can get iterator cursor by using iterator method.i.e.Iterator  itr =l.iterator();
		 it can be used with any collection object
		 it has methods -> hasNext() return boolean ,next() return object,remove()
		 it is an interface
		 by using iterator cursor , we can retrieve elements only in forward direction
		  by using iterator cursor , we can retrieve elements or remove elements
		  
		 
		 LISTITERATOR:-
		  we can get list iterator cursor by using list iterator method.i.e.ListIterator litr=	l.listIterator();
		  it can be used only with list implemented classes i.e. array list,linked list,stack,vector
		  it has methods -> hasNext(),next(),hasPrevious(),previous(),remove(),set().
		  it is an interface
		  by using iterator cursor , we can retrieve elements in forward & backward direction
		  by using iterator cursor , we can retrieve elements, remove, replace,add 

		 Note: interview questions -> How many cursors are there in java collections
		 Difference between iterator and list iterator
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 */

	}

}
