package OOPS;
abstract class Shape1
{
	public abstract void area(double r);
}
class Circle1 extends Shape1
{
	public void area(double r)
	{
		System.out.println("AREA OF CIRCLE:"+Math.PI*r*r);
	}
}
class Square1 extends Shape1{
	public void area(double r)
	{
		System.out.println("AREA OF SQUARE IS:"+r*r);
	}
}

public class DynamicBinding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Shape1 sp1;
  Shape1 sp2;
  Circle1 cr1=new Circle1();
  sp1=cr1;
  Square1 sq1=new Square1();
  sp2=sq1;
  sp1=sp2;//DYNAMIC BINDING
  sp1.area(5.0);
  
	}

}
