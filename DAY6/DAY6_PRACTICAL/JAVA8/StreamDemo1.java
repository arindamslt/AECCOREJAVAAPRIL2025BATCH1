package JAVA8;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Item> arr=new ArrayList<Item>();
arr.add(new Item("P1","TV",5,25000.00,"SAMSUNG"));
arr.add(new Item("P2","TAB",2,22000.00,"HP"));
arr.add(new Item("P3","LAPTOP",15,45000.00,"HP"));
arr.add(new Item("P4","MOBILE",3,12000.00,"SAMSUNG"));
arr.add(new Item("P5","CONVECTION",6,28000.00,"LG"));
System.out.println("DISPLAY ALL PRODUCTS");
arr.stream().forEach(System.out::println);
System.out.println("DISPLAY DATA ASCENDING ORDER OF PRODUCT NAME");
arr.stream().sorted((p1,p2)->p1.getPname().compareTo(p2.getPname())).forEach(System.out::println);
System.out.println("FIND OUT DATA BASED ON DESCENDING ORDER OF PRICE OF THE PRODUCT");
arr.stream().sorted((p1,p2)->p2.getPrice().compareTo(p1.getPrice())).forEach(System.out::println);
System.out.println("FIND OUT THOSE PRODUCT WHOSE COMPANY NAME IS SAMSUNG");
arr.stream().filter(p->p.getCompnm().equals("SAMSUNG")).forEach(System.out::println);
System.out.println("FIND OUT THOSE PRODUCT IS SAMSUNG AND PRODUCT NAME IS MOBILE");
arr.stream().filter(p->p.getCompnm().equals("SAMSUNG")).filter(p->p.getPname().equals("MOBILE")).forEach(System.out::println);
System.out.println("DISCOUNT OFFER  1000/-  To ALL PRODUCTS");
arr.stream().map(p->p.getPrice()-1000.00+"=>"+p.getPname()+"==>"+p.getCompnm()).forEach(System.out::println);
System.out.println("OFFER GIVE TO THE LG PRODUCT FOR 1000");
arr.stream().filter(p->p.getCompnm().equals("LG")).map(p->p.getPrice()-1000.00+"=>"+p.getPname()).forEach(System.out::println);
Stream<Integer> s=Stream.of(10,100,1000,10000,100000);
s.forEach(System.out::println);

	}

}
