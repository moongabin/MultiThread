package MultiThread;

public class Account {
	 int balance = 1000;
	 
	    public void withdraw(int money)
	    {
	        if(balance >= money)
	        {
	            try
	            {
	                Thread.sleep(1000);
	            }catch(Exception e) { }
	                balance -= money;
	        }
	    }



}
