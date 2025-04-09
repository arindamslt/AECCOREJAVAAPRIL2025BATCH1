package OOPS;
class Product
{
	public String pid;
	public String pname;
	public int pqty;
	public double price;
	public String sdt="07/04/2025";
	public Product(String pid,String pname,int pqty,double price)
	{
		this.pid=pid;
		this.pname=pname;
		this.pqty=pqty;
		this.price=price;
	}
	public void productView()
	{
		System.out.println("PRODUCT ID:"+pid);
		System.out.println("PRODUCT NAME:"+pname);
		System.out.println("QUANTITY:"+pqty);
		System.out.println("PRICE:"+price);
	}
	public void salesOrder()
	{
		this.productView();
		double total;
		total=this.pqty*this.price;
		System.out.println("TOTAL SALES AMOUNT:"+total);
		System.out.println("SALESDATE:"+sdt);
	}
}

public class ThisDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Product ps =new Product("P1","TV", 5,25000.00);
  //ps.productView();
  ps.salesOrder();
	}

}
