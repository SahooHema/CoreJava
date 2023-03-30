package StringInterviewQuestions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FirstNonRepeatCharacter {

	public static void main(String[] args) {
		
String s="facebook";






















char c=nonRepeatChar(s);
System.out.println("first non repeat char is:"+c);
		
	}
		
//		String s="swiss";
//		
//  char[] c= s.toCharArray();
//		
//		for(Character ch: c) {
//			if(s.indexOf(ch)==s.lastIndexOf(ch)) {
//				System.out.println(ch);
//				break;}
	/////////////////////////////////////	
		
public static Character nonRepeatChar(String s) {
	
	Set<Character> sh=new HashSet<Character>();
	List<Character> al=new ArrayList<Character>();

	for(int i=0;i<s.length();i++) {
	char ch=	s.charAt(i);
	
	if(sh.contains(ch))
		continue;
	
	if(al.contains(ch)) {
		al.remove((Character)ch);
		sh.add(ch);
		
	}
	else {
		al.add(ch);
	}
		
	}
	
	return al.get(0);
	
	
}
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
}