package MultiThread;

public class Thread6 {
	 public static void main(String args[])
	    {
	        Bank t1 = new Bank("ATM");
	        Bank t2 = new Bank("����");
	        
	        t1.start();
	        t2.start();
	    }

}
