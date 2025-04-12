package Thread;
class Fthread extends Thread
{
	public void run()
	{
		for(int i=1;i<=50;i++)
		{
			System.out.println(Fthread.currentThread().getName()+":"+i);
		}
	}
}
class Sthread extends Thread
{
	public void run()
	{
		for(int i=51;i<=100;i++)
		{
			System.out.println(Sthread.currentThread().getName()+":"+i);
		}
	}
}

public class ThreadScheduling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Fthread ft=new Fthread();
  Sthread sd=new Sthread();
  ft.setPriority(10);
  sd.setPriority(1);
  ft.start();
  sd.start();
	}

}
