package MultiThread;

public class Thread6 {
	static Account obj = new Account();
	 public static void main(String args[])
	    {
	        Bank t1 = new Bank("ATM");
	        Bank t2 = new Bank("����");
	        
	        t1.start();
	        t2.start();
	        
	        try{
	        	
	        t1.join();
	        System.out.println("ATM ����");
	        
	        
	        t2.join();
	        System.out.println("���� ����");
	        }catch (Exception e){
	        }
	        
	        }
	    

}
