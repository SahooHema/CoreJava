package StringInterviewQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateCharacter {

	public static void main(String[] args) {
	
		String  s= "beauiful beach";
		
		
	Map<Character,Integer> mp=new HashMap<Character,Integer>();
	char[] c=	s.toCharArray();
	
		for(Character ch:c) {
		if(mp.containsKey(ch)) {
		mp.put(ch, mp.get(ch)+1);
		}
		else {
			mp.put(ch, 1);
		}
		}
		
		Set<Entry<Character, Integer>> ms=mp.entrySet();
		
		for(Entry<Character, Integer> me:ms) {
			if(me.getValue()>1) {
				System.out.println(me.getKey());
			}
		}
	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
