package JAVA8;
class Testss 
{

	
	public void display() {
		System.out.println("WELCOME");
	}
	
}
public class Mdeno {
public static void main(String[] args) {
	Testss ts=new Testss();
	Inter i1=ts::display;
	i1.show();
}
}


