package JAVA8;
class Test implements Inter
{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("FUNCTIONAL INTERFACE");
	}
	
}
public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Test t=new Test();
  t.show();
	}

}
