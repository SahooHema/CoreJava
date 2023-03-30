package StringInterviewQuestions;

public class CountWordsInString {
	
	public static void main(String[] args) {
		
		String str="this is hema sahoo";
	int i=	countWords(str);
	System.out.println(i);
		
	}
		public static int countWords(String input) {
			String str="this is hema sahoo";
			if(str==null ||str.isEmpty() ) {
				return 0;
			}
		String[] words=	str.split("\\s+");
		return words.length;
		}

		

}
