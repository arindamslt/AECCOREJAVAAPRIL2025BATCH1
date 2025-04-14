package JAVA8;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class PfnWithPojo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Product> arr=new ArrayList<Product>();
arr.add(new Product("P1","TV",5,25000.00));
arr.add(new Product("P2","TAB",7,22000.00));
arr.add(new Product("P3","LAPTOP",10,45000.00));
arr.add(new Product("P4","MOBILE",2,12000.00));
arr.add(new Product("P51","CONVECTION",5,27000.00));
for(Product p:arr)
{
	System.out.println(p);
}
System.out.println("FIND OUT THOSE PRODUCT PRICE IS GREATER THAN 25000");
Predicate<Product> p1=p->p.getPrice()>25000.00;
for(Product p:arr)
{
	if(p1.test(p))
	{
		System.out.println(p);
	}
}
System.out.println("FIND OUT THOSE PRODUCT QUANTITY IS GREATER THAN 5");
Predicate<Product> p2=p->p.getPqty()>5;
for(Product p:arr)
{
	if(p2.test(p))
	{
		System.out.println(p);
	}
}
System.out.println("FIND OUT THOSE PRODUCT QUANTITY IS GREATER THAN 5 AND PRICE >25000.00");
for(Product p:arr)
{
	if(p1.and(p2).test(p))
	{
		System.out.println(p);
	}
}
System.out.println("CALCULATING TOTAL SALES");
double total=0.0;
Function<Product,Double> f=p->p.getPrice()*p.getPqty();
for(Product pt:arr)
{
	total=total+f.apply(pt);
}
System.out.println("TOTAL PRICE:"+total);
	}

}
