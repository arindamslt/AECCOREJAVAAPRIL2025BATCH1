package JAVA8;
class Ts implements Tst
{


	public void show() {
		// TODO Auto-generated method stub
		System.out.println("METHOD OVERRIDING");
	}
	public void show1()
	{
		System.out.println("DEFAULT METHOD OVERRRIDDING");
	}
	
}
public class DefauktMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Ts ts=new  Ts();
 ts.show();
 ts.show1();
	}

}
