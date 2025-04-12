package Thread;
class TThread extends Thread
{
	public void run()
	{
	try
	  {
		  for(int i=1;i<=100;i++)
		  {
			  System.out.println(TThread.currentThread().getName()+":"+i);
			  Thread.sleep(100);
		  }
	}
	 catch(InterruptedException ie)
	{
		 ie.printStackTrace();
	}
	}
	
}
class TThread2 extends Thread
{
	public void run()
	{
	try
	  {
		  for(int i=151;i<=250;i++)
		  {
			  System.out.println(TThread2.currentThread().getName()+":"+i);
			  Thread.sleep(100);
		  }
	}
	 catch(InterruptedException ie)
	{
		 ie.printStackTrace();
	}
	}
	
}
public class DaemonThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      TThread th=new TThread();
      TThread2 th2=new TThread2();
      th.setDaemon(true);
      //th2.start();
      th.start();
        try
        {
        	for(int i=101;i<=150;i++)
        	{
        		System.out.println(Thread.currentThread().getName()+":"+i);
        		Thread.sleep(100);
        	}
        }
        catch(InterruptedException ie)
        {
        	ie.printStackTrace();
        }
	}

}
