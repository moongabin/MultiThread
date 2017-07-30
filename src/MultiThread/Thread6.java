package MultiThread;

public class Thread6 {
	static Account obj = new Account();
	 public static void main(String args[])
	    {
	        Bank t1 = new Bank("ATM");
	        Bank t2 = new Bank("은행");
	        
	        t1.start();
	        t2.start();
	        
	        try{
	        	
	        t1.join();
	        System.out.println("ATM 종료");
	        
	        
	        t2.join();
	        System.out.println("은행 종료");
	        }catch (Exception e){
	        }
	        
	        }
	    

}
