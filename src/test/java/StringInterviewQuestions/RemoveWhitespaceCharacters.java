package StringInterviewQuestions;

public class RemoveWhitespaceCharacters {

	public static void main(String[] args) {
		
		String str="This   is  hema";
	String st=	str.replaceAll("\\s", "");
		System.out.println("String is:"+st);
	
		
		
		/////////////////removespecialcharacters/////////
		
		
		String strr="!@#$%%()* this is hema";
	String rep=	strr.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(rep);
		
		
		
		
		
		
		
//		
		
		//////////////////////////////missing number in array/////////////
		

		
		
		
		
		
		
	}

}
