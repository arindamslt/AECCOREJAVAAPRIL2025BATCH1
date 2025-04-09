package OOPS;
class Company
{
	public String compnm="CTS";
	public String loc="KOLKATA";
	public void display()
	{
		System.out.println("COMPANY DETAILS");
		System.out.println("=====================");
		System.out.println("COMPANY NAME:"+compnm);
		System.out.println("LOCATION:"+loc);
	}
}
class Job extends Company
{
	public String tech;
	public double exp;
	public String enddt;
	public String city;
	public void offer(String tech,double exp)
	{
		this.tech=tech;
		this.exp=exp;
		System.out.println("JOB OFFER1");
		System.out.println("==================");
		System.out.println("TECHNOLOGY"+this.tech);
		System.out.println("EXPERIENCE:"+this.exp);
	}
	public void offer(String tech,double exp,String city)
	{
		this.tech=tech;
		this.exp=exp;
		this.city=city;
		System.out.println("JOB OFFER2");
		System.out.println("===================");
		System.out.println("TECHNOLOGY"+this.tech);
		System.out.println("EXPERIENCE:"+this.exp);
		System.out.println("CITY:"+this.city);
	}
	public void offer(String tech,double exp,String city,String enddt)
	{
		this.tech=tech;
		this.exp=exp;
		this.city=city;
		this.enddt=enddt;
		System.out.println("JOB OFFER3");
		System.out.println("==========================");
		System.out.println("TECHNOLOGY:"+this.tech);
		System.out.println("EXPERIENCE:"+this.exp);
		System.out.println("CITY:"+this.city);
		System.out.println("LAST DATE OF APPLICATION:"+this.enddt);
	}
}
class Candidate extends Job implements Interview
{
  public String canddm;
  public String phno;
  public String email;
  public String tech;
  public Candidate(String candnm,String phno,String email,String tech)
  {
	  this.canddm=candnm;
	  this.phno=phno;
	  this.email=email;
	  this.tech=tech;
  }
  public void show()
  {
	  System.out.println("CANDIADTE DETAILS");
	  System.out.println("============================");
	  System.out.println("CANDIDATE NAME:"+canddm);
	  System.out.println("PHONE NUMBER:"+phno);
	  System.out.println("EMAIL ID:"+email);
	  System.out.println("TECHNOLOGY:"+tech);
  }
	@Override
	public void schedule() {
		// TODO Auto-generated method stub
		System.out.println("EVALUATION DATE IS: 09.04.2025");
	}
	
}
public class CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Candidate c1=new Candidate("ALOKE","655665","al@gmail.com","JAVA");
c1.show();
c1.offer("PYTHON",2.5);
c1.offer("NODEJS", 4,"DELHI");
c1.offer("JAVA",2,"KOLKATA","15/04/2025");
c1.schedule();

	}

}
