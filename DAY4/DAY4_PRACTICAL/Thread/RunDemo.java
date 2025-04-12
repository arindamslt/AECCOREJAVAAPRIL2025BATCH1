package Thread;
class FirstThreads extends Thread
{
	public void run()
	{
		try
		{
		   for(int i=1;i<=100;i++)
		   {
			  System.out.println("THREAD1:"+i);
			  Thread.sleep(50);
		   }
		}
		catch(InterruptedException ie)
		{
			ie.printStackTrace();
		}
	}
}
class SecondThreads extends Thread
{
	public void run()
	{
		try
		{
		   for(int i=101;i<=150;i++)
		  {
			System.out.println("THREAD2:"+i);
			Thread.sleep(100);
		  }
		}
		catch(InterruptedException ie)
		{
			ie.printStackTrace();
		}
	}
}
public class RunDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  FirstThreads ft=new FirstThreads();
  SecondThreads sd=new SecondThreads();
  ft.run();
  sd.run();
	}

}
