package OOPS;
class Parent
{
	int x=10;
}
class Child extends Parent{
	int y=25;
	public void add()
	{
		int z;
		z=x+y;
		System.out.println("RESULT:"+z);
	}
}
public class SingleInheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Child ch=new Child();
  ch.add();
	}

}
