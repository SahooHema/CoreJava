package StringInterviewQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountOcuurenceOfEachCharacter {

	public static void main(String[] args) {
		
		String s="java is object oriented language";
		
		
	char[] c=s.toCharArray();
		
		Map<Character,Integer> mp=new HashMap<Character,Integer>();
		
		for(Character ch:c) {
			
		if(mp.containsKey(ch)) {
			mp.put(ch, mp.get(ch)+1);
		}
		else {
			mp.put(ch, 1);
		}
		}
		
		//Set<Entry<Character, Integer>>	ms=mp.entrySet();
		
 
		for(Entry<Character,Integer>me:mp.entrySet()) {
			 System.out.println(me.getKey()+" "+me.getValue());
		
		
		}
		
	
		
		
		
		
		
		
		

	}

}
