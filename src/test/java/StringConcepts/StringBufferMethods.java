package StringConcepts;

public class StringBufferMethods {

	public static void main(String[] args) {
	
//		StringBuffer sb=new StringBuffer("Anand sahoo");
//		sb.append("Rahul");
//		System.out.println(sb);//Anand sahooRahul
//		
//		
//		StringBuffer sb1=new StringBuffer();
//		System.out.println(sb1.capacity());//16 by deafult
//		
//		
//		
//		StringBuffer sb2=new StringBuffer("hema");
//		System.out.println(sb2.capacity());//20 i.e. 16+4=20
//		
//		
//		
//		StringBuffer sb3=new StringBuffer(1000);
//		System.out.println(sb3.capacity());//1000
//		
//		
//		
//		sb1.append("hello");
//		System.out.println(sb1.capacity());//16
//		
//		sb1.append("heema ssahoo");
//		System.out.println(sb1.capacity());//34
//		
//		
//		StringBuffer sb4=new StringBuffer("hemasahoo");
//		System.out.println(sb4.append("mohini"));//hemasahoomohini
//		
//		System.out.println(sb4.charAt(2));//m
//		
//		System.out.println(sb4.delete(0, 3));//asahoomohini
//		System.out.println(sb4.deleteCharAt(5));//asahomohini
//		
//		StringBuffer sb5=new StringBuffer("hemasahoo");
//		System.out.println(sb4.equals(sb5));//false
//		
//		System.out.println(sb.indexOf("h"));//8
//		
//		System.out.println(sb.lastIndexOf("o"));//10
//		
//		System.out.println(sb.insert(3, "k"));//sahkoo
		
//	System.out.println(sb.replace(0, 4, "mohini"));//mohinio/
		
//	System.out.println(sb.reverse());//oohas
//	
//	System.out.println(sb.subSequence(2, 8));//and sa
//System.out.println(sb.substring(2, 8));
	
//System.out.println(sb.toString());
		
		
		StringBuffer sb6=new StringBuffer("Anand sahoo");
        sb6.ensureCapacity(100);
//	sb6.setCharAt(2,'k');
//		sb6.setLength(5);
//		sb6.trimToSize();
		System.out.println(sb6);
		
		
		
/*Note:- It is mutable object
 if more than 16 characters , then capacity() method will give result i.e. 16*2+2=34
 capacity() method will define how many characters will objects store in it..		
 length() method will define characters in a current string
 equals() method :- stringBuffer class cannot override the equals method of object class, but string class  can override..	
 EG:-
 StringBuffer sb4=new StringBuffer("hemasahoo");
 StringBuffer sb5=new StringBuffer("hemasahoo");
 System.out.println(sb4.equals(sb5));//false
 insert() method will add value before the index specified..	eg:- System.out.println(sb.insert(3, "k"));//sahkoo
 toString() method convert stringBuffer into string..	
 		
 */
		
		
		
		
		
		
		
		

	}

}
