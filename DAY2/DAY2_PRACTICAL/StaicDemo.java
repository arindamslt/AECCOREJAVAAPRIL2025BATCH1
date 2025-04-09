package OOPS;
class UseSatic
{
	public  static int x=25;
	public static void show()
	{
		System.out.println("X:"+x);
	}
	
}
public class StaicDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UseSatic.show();
		System.out.println(UseSatic.x);

	}

}
