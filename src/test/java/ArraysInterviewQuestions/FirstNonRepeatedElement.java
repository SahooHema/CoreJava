package ArraysInterviewQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FirstNonRepeatedElement {

	public static void main(String[] args) {
		
		int[] s= {23,45,67,89,45,67};
		
		Map<Integer,Integer> mp=new HashMap<Integer,Integer>();
		
		
		for(int no:s) {
			if(mp.containsKey(no)) {
			mp.put(no, mp.get(no)+1);
			}
			else {
				mp.put(no, 1);
			}
			
		}
		
		for(int i=0;i<s.length;i++) {
		if(mp.get(s[i])==1) {
			System.out.println("The first non-repeat element is:"+s[i]);
			break;
			}
		}
	}

}
