package Collections;

import java.util.ArrayList;


public class CollectionDemo {

	public static void main(String[] args) {
	
		ArrayList al=new ArrayList();
		ArrayList al2=new ArrayList();
		al2.add(11);
		al2.add(22);
		al.add(10);
		al.add(20);
		al.add("hema");
		al.add("sana");
		al.add("shefali");
		al.remove("hema");

		
	al.addAll(al2);
	System.out.println(al);//[10, 20, 11, 22]
	System.out.println(al.add("ui"));//	true
	System.out.println(al);//[10, 20, 11, 22, ui]	
	System.out.println(al.contains(11));//	true
	System.out.println(al.isEmpty());//false
		System.out.println(al.size());//2
	System.out.println(al.remove(0));//20
	System.out.println(al.remove(10));//" java.lang.IndexOutOfBoundsException i.e. it count 10 as index position but array size is 2..
//note: remove(index int) is arraylist method not collection method
			System.out.println(al);//[sana, shefali]
		
		
		ArrayList al1=new ArrayList();	
		al1.add("fff");
		al1.add("ddd");
		al1.add("eee");
		al1.clear();//return void
		System.out.println(al1);//[]
		
		ArrayList al3=new ArrayList();	
		al3.add("www");
		al3.add("aaa");
		al3.add("eee");
		
		
		al1.removeAll(al3);
		System.out.println(al1);//[fff, ddd]
		System.out.println(al3);//[www, aaa, eee]
		
		
		
		
		
		
		
		
		
//note: removeAll() it removes duplicates from 1st array list , but it does not remove duplicate value from 2nd array list
		
		
		
		
	
		

	}

}
