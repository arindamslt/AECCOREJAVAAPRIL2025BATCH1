package String;

import java.util.Objects;

class Employee
{
	public String eid;
	public String ename;
	public String desg;
	/*public Employee(String eid,String ename,String desg)
	{
		this.eid=eid;
		this.ename=ename;
		this.desg=desg;
	}*/
	
	/*public String toString()
	{
		return eid+"===>"+ename+"===>"+desg;
	}*/
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", desg=" + desg + "]";
	}
	public Employee(String eid, String ename, String desg) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.desg = desg;
	}
	/*public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}*/
	
	
}
public class ObjectHandelling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Employee emp=new Employee("E1","ABHISHEK","MANAGER");
  System.out.println(emp);
	}

}
