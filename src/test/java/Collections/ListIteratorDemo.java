package Collections;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		List l=new ArrayList();
		l.add("hema");
		l.add(20);//collection object
		
		ListIterator  itr =l.listIterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());	
		}
		//output:-
		//hema
		//20
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());	
			}
//		//output:-
//		20
//		hema
		
		l.add("sahoo");
		System.out.println(l);//[hema, 20, sahoo]
		
		l.set(1,"mohini");
		System.out.println(l);//[hema, mohini, sahoo]

		
	}

}
