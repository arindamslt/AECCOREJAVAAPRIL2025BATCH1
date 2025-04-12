package Thread;
class Stock
{
	int qoh=50;
	public synchronized void demand(int req)
	{
		try
		{
		    if(req>qoh)
		   {
		    	System.out.println("BEFORE WAITING:"+this.qoh);
			  this.wait();//THREAD WILL BE IN WAITING STAGE
		    }
		    System.out.println("CURRENT STOCK:"+(this.qoh-req));
		}
		catch(InterruptedException ie)
		{
			ie.printStackTrace();
		}
	}
	public synchronized void supply(int qty)
	{
		this.qoh=this.qoh+qty;
		System.out.println("CURRENT STOCK AFTER SUPPLY:"+this.qoh);
		this.notify();//WAITING THREAD IS BEING ALIVE
		
	}
}
class Consumer extends Thread
{
	Stock st;//Object Reference
	public Consumer(Stock st)
	{
		this.st=st;
	}
	public void run()
	{
		st.demand(75);
	}
	
}
class Producer extends Thread
{
	Stock st;
	public Producer(Stock st)
	{
		this.st=st;
	}
	public void run()
	{
		st.supply(50);
	}
}
public class ConsumerProducerProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Stock st=new Stock();
  Consumer cs=new Consumer(st);
  Producer ps=new Producer(st);
  cs.start();
  ps.start();
	}

}
