package COLLECTION;

import java.util.ArrayList;
import java.util.Iterator;

public class UserDefinedCollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Product> arr=new ArrayList<Product>();
arr.add(new Product("P1","TV",5,25000.00));
arr.add(new Product("P2","TAB",6,22000.00));
arr.add(new Product("P3","CONVECTION",10,18000.00));
arr.add(new Product("P4","LAPTOP",15,45000.00));
arr.add(new Product("P5","REFRIGERATOR",12,27000.00));
/*Iterator<Product> itr=arr.iterator();
while(itr.hasNext())
{
	 Product p= (Product)itr.next();
	 System.out.println(p.getPid()+"==>"+p.getPname()+"==>"+p.getPqty()+"==>"+p.getPrice());
}*/
for(Product p:arr)
{
	 //System.out.println(p.getPid()+"==>"+p.getPname()+"==>"+p.getPqty()+"==>"+p.getPrice());
	System.out.println(p);
}
	}

}
