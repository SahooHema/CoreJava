package StringInterviewQuestions;

public class ReverseWordsInString {

	public static void main(String[] args) {
	
//		 String str = "Java Programming";
//		 String rev="";
//         
//        String[] words =str.split("\\s");
//        
//        for(int i=0;i<words.length;i++) {
//        	String word= words[i]; 
//        	String revwords="";
//        	
//        	for(int j=word.length()-1;j>=0;j--) {
//        		revwords=revwords+word.charAt(j);
//        	}
//        	
//         rev=rev+revwords+" ";
//        }
//        System.out.println(rev);
//        
		
		
		String str="hema sahoo";
		
		String rev="";
		
	String[] words=	str.split("\\s");
		
		for(int i=0;i<words.length;i++) {
		String word=words[i];
		String revword="";
		
		
		for(int j=word.length()-1;j>=0;j--) {
			revword=revword+word.charAt(j);
		}
		
		rev=rev+revword+" ";
		
		
		}
		
		System.out.println(rev);
		
		
		
		
		
		
}
}