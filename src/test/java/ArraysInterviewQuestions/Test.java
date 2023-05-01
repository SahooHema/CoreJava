package ArraysInterviewQuestions;


import java.util.ArrayList;
import java.util.HashMap;

import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class Test {
	
	public static void main(String[] args) {
		int[] a= {10,5,8,4,3,7};
		ArrayList al1=new ArrayList<Integer>();
		ArrayList al2=new ArrayList<Integer>();
		
		
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				al1.add(a[i]);
			}
			else {
				al2.add(a[i]);
			}
		}
	
		
	
}}