package Collections;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.HashSet;
import java.util.Vector;

import java.util.Iterator;
import java.util.Set;
public class Test {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add("20");
		v.add("90");
		
		Enumeration  e=	v.elements();
	while(e.hasMoreElements()) {
	System.out.println(e.nextElement());
	}
	
	}

}
