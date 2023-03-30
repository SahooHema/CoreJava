package DiiferentCasesForExecuingThreads;

public class TestThread {

	public static void main(String[] args) {
		PlayMusic t1=new PlayMusic();
		t1.start();
		
		PlayVideo t2=new PlayVideo();
		t2.start();
		

	}

}
