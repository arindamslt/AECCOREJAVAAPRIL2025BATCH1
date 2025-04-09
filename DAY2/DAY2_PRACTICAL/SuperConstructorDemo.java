package OOPS;
class Patient
{
	public String pid;
	public String pname;
	public int age;
	public Patient(String pid,String pname,int age)
	{
		this.pid=pid;
		this.pname=pname;
		this.age=age;
	}
	public void pdetails()
	{
		System.out.println("PATIENT ID:"+pid);
		System.out.println("PATIENT NAME:"+pname);
		System.out.println("AGE:"+age);
	}
}
class LabTest extends Patient
{
	public String testnm;
	public String tdt;
	public double price;
	public LabTest(String pid,String pname,int age,String testnm,String tdt,double price)
	{
	    super(pid,pname,age);//calling super class constructor
	  this.testnm=testnm;
	  this.tdt=tdt;
	  this.price=price;


	}
	public void testDetails()
	{
		System.out.println("TEST DONE:"+testnm);
		System.out.println("TEST DATE:"+tdt);
		System.out.println("TEST PRICE:"+price);
	}

	
}
public class SuperConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    LabTest lt=new LabTest("PT1","SUMAN",22,"X-RAY","09/04/2025",1000.00);
    lt.pdetails();
    lt.testDetails();
	}

}
