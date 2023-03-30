package DiiferentCasesForExecuingThreads;

public class DifferentCasesForExectingThreads {

	public static void main(String[] args) {


	}

}

/*
case1: performing single task from single thread.eg- TestTread class
case2: performing single task from multiple thread.eg- TestTread class in this create two thread(create 2 object of class) and main is by default thread..
Note: 3 thread create 
case3: performing multiple task from single thread-> this is not possible
case4: performing multiple task from multiple thread-> create two separate class and one main class in which create object of two previous and call methods of it
Note: it is not necessary that if create object of Test1 class, so it will call run method first, Tes2t can also call run method first.
Each thread will execute different task at the same time






*/