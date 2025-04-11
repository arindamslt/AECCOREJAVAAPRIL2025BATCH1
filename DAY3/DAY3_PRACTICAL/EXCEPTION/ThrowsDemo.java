package EXCEPTION;
class Calculators
{
	public int x=25;
	public int y=0;
	public void result() throws ArithmeticException,Exception
	{
		
		    int z;
		    z=x/y;//Arithmetic Exception Occur
		   System.out.println("RESULT:"+z);
		
	}
	
}
public class ThrowsDemo {

	public static void main(String[] args) throws ArithmeticException,Exception {
		// TODO Auto-generated method stub
  Calculators cl=new Calculators();
  cl.result();
	}

}
