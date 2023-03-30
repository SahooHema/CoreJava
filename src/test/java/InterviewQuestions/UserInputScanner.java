package InterviewQuestions;

import java.io.FileInputStream;

import java.util.Scanner;

public class UserInputScanner {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter name");
String name= s.next();
System.out.println("enter gender");
char gender=s.next().charAt(0);
System.out.println("enter age");
int age=s.nextInt();
System.out.println("enter phonenumber");
long number=s.nextLong();
System.out.println(name);
System.out.println(gender);
System.out.println(age);
System.out.println(number);
	}

}
