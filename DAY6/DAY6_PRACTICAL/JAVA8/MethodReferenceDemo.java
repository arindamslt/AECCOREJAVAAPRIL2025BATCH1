package JAVA8;
class Tsts
{
	public void display()
	{
		System.out.println("METHOD REFERENCE");
	}
}
public class MethodReferenceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Tsts t=new Tsts();
  Inter i6=t::display;//show()=display()
  i6.show();
	}

}
