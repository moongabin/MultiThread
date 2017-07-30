package MultiThread;

public class Bank extends Thread{
	 static Account obj = new Account();
	    public Bank() { }
	    public Bank(String name) { super(name); }
	    public void run()
	    {
	        while(true)
	        {
	            // ��Ƽ ������ 
	            synchronized(obj)
	            {
	                int money = (int)(Math.random() * 3 + 1) *100;
	                if(obj.balance >= money)
	                {
	                    System.out.println(getName() + " : ������ balance : " + obj.balance+"\n");
	                    System.out.println(getName() + ": ã�� �ݾ� : " + money+"\n");
	                    obj.withdraw(money);
	                    System.out.println(getName() + " : ������ balance : " + obj.balance+"\n");
	                }else
	                {
	                    System.out.println("�ܾ� ����\n");
	                    break;
	                }
	            }
	        }
	    }

}
