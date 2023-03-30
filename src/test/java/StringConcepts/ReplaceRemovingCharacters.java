package StringConcepts;

//Methods to update string
public class ReplaceRemovingCharacters {

	public static void main(String[] args) {
	
		String s="this is demo";
		
		System.out.println(s.replace("is", "was")); //thwas was demo
		System.out.println(s.replaceFirst("is","was"));//thwas is demo
		System.out.println(s.replaceAll("is", "was"));//thwas was demo
		System.out.println(s.replaceAll("is(.)", "was"));//thwaswasdemo
		System.out.println(s.replaceAll("is(.*)", "was"));//thwas
//	Note: replaceAll() -> in this method use regex expression "." , then space will be removed...
//replaceAll() -> in this method use regex xpression ".*", then space will be removed and characters as well..
//It returns strings		

	}

}
