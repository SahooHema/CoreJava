package Collections;

import java.util.Enumeration;

import java.util.Vector;

public class EnumerationMethods {

	public static void main(String[] args) {
	
		Vector v= new Vector();
		v.add("hema");
		v.add("sahoo");
		
				
	//	System.out.println(v);//[hema, sahoo]
		Enumeration e=	v.elements();
		while(e.hasMoreElements()) {
		System.out.println(e.nextElement());	
		}
//output:-	
//hema
//sahoo	
		
		
	
	/*
Enumeration is a cursor which can be used for retrieving the elements one by one from the collection
It was introduced in jdk 1.0 version
It can be used with only legacy classes i.e. vector and stack	 	
Enumeration cursor can be get by elements() method which is present in vector and stack class	
Methods of enumerator are-> hasMoreElements(),nextElement(),
It is used to retrieve elements in forward direction	 	
It is used for only read or retrieve operation	 	
interview questions:- what are the limitations of enumeration? , what are the disadvantages of enumeration?	 	
	 	
	 	
	 	
	 	
	 	
	 */
		
	
	}

}
