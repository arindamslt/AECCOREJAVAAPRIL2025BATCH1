package Thread;
class FirstThread extends Thread
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
class SecondThread extends Thread
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
public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FirstThread ft=new FirstThread();//READY STAGE
SecondThread sd=new SecondThread();//READY STAGE
ft.start();//RUNNING
sd.start();//RUNNING
try
{
	for(int i=151;i<=225;i++)
	{
		System.out.println("MAIN:"+i);
		Thread.sleep(50);
	}
}
catch(InterruptedException ie)
{
	ie.printStackTrace();
}
	}

}
