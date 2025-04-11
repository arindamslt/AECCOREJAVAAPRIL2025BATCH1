package EXCEPTION;
class Testing
{
	public int x=25;
	public int y=0;
	public void checkTest()
	{
		try
		{
		System.out.println("X:"+x);//Statement1
		int z;
		z=x/y;
		System.out.println("RES:"+z);//STATEMENT2
		System.out.println("INSIDE TRY BLOCK");//STATEMENT3
		
		}
		catch(ArithmeticException ae)
		{
			ae.printStackTrace();//Statemen4
		}
		catch(NullPointerException ne)
		{
			ne.printStackTrace();
		}
		//System.out.println(x/0);//STATEMENT5
		try
		{
		System.out.println("OUTSIDE TRY");
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	public void show()
	{
		System.out.println("Y:"+y);
	}
}
public class FlowOfException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Testing t=new Testing();
    t.checkTest();
    t.show();
	}

}
