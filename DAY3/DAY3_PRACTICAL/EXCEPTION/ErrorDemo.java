package EXCEPTION;
class TestError
{
	public void test1()
	{
		System.out.println("TEST1");
		this.test2();
	}
	public void test2()
	{
		System.out.println("TEST2");
		this.test1();
	}
}
public class ErrorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  TestError te=new TestError();
  te.test1();
	}

}
