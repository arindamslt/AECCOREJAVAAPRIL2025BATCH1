package OOPS;
class Calculator
{
	public int add(int a,int b)
	{
		return(a+b);
	}
	public float add(int a,float b)
	{
		return(a+b);
	}
	public double add(double a,double b)
	{
		return(a+b);
	}
}
public class MethodOverloaddingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c=new Calculator();
		System.out.println(c.add(5,6));
		System.out.println(c.add(5,6.5));
		System.out.println(c.add(6.5,11.6));

	}

}
