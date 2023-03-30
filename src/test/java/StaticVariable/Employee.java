package StaticVariable;

public class Employee {
	int emp_id;
	String language;
	static String emp_name="hema";
	
	public Employee(int emp_id,String language) {
		this.emp_id=emp_id;
		this.language=language;
		
	}

	public void showDetails() {
		System.out.println(emp_id+" "+language+" "+emp_name);
	}
	public static void main(String[] args) {
	 
		Employee obj=new Employee(10,"java");
		obj.showDetails();
		
		Employee obj1=new Employee(12,"c++");
		obj1.showDetails();
	}

}
/*
Example of memory management coz we have define name var as static so every object reference will use shared memory for the name var and don't need to pass name in each constructor as parmeter
name var will occupy method  and class area and we can share with objects i.e. obj1 and bj2.
The static variables will get memory only once in class during class loading..





*/