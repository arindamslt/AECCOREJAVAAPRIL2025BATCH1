package Thread;
class Accounts
{
	double balance=15000.00;
	public  void debit(double amount)
	{
		try
		{
			for(int i=1;i<=50;i++)
			{
				System.out.println("DEBIT:"+i);
				Thread.sleep(100);
			}
		}

		
		catch(InterruptedException ie)
		{
			ie.printStackTrace();
		}
		synchronized (this) {
			this.balance=this.balance-amount;
			System.out.println("AFTER DEBIT:"+this.balance);
		}
		
		
		
	}
	public synchronized void credit(double amount)
	{
		this.balance=this.balance+amount;
		System.out.println("AFTER CREDIT:"+this.balance);
	}
}
class Customer4 extends Thread
{
	Accounts acc;//object reference
	public Customer4(Accounts acc)
	{
		this.acc=acc;
	}
	public void run()
	{
		acc.debit(9000.00);
	}
}
class Customer5 extends Thread
{
	Accounts acc;//object reference
	public Customer5(Accounts acc)
	{
		this.acc=acc;
	}
	public void run()
	{
		acc.debit(7000.00);
	}
}
class Customer6 extends Thread
{
	Accounts acc;
	public Customer6(Accounts acc)
	{
		this.acc=acc;
	}
	public void run()
	{
		acc.credit(5000.00);
	}
}
public class SynchronizationDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Accounts acc=new Accounts();
		  Customer4 cs1=new Customer4(acc);
		  Customer5 cs2=new Customer5(acc);
		  Customer6 cs3=new Customer6(acc);
		  cs1.start();
		  cs2.start();
		  cs3.start();
	}

}
