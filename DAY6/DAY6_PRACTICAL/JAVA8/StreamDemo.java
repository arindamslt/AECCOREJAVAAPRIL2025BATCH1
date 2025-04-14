package JAVA8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> arr=new ArrayList<Integer>();
arr.add(5);
arr.add(15);
arr.add(25);
arr.add(20);
arr.add(30);
arr.add(40);
System.out.println("TRAVERSE THE LEMENTS ====================");
arr.stream().forEach(System.out::println);
//arr.stream().forEach(a->System.out.println(a));
System.out.println("DISPLAY EVEN VALUES=================");
arr.stream().filter(i->i%2==0).forEach(System.out::println);
System.out.println("MAP FUNCTION==============");
arr.stream().map(i->i+10).forEach(System.out::println);
System.out.println("ASCENDING ORDER===================");
arr.stream().sorted().forEach(System.out::println);
System.out.println("DESCENDING ORDER DATA DISPLAY===========");
arr.stream().sorted((i1,i2)->i2.compareTo(i1)).forEach(System.out::println);
System.out.println("MAX VALUE");
int max=arr.stream().max((i1,i2)->i1.compareTo(i2)).get();
System.out.println("MAXIMUM VALUE:"+max);
System.out.println("MINIMUM VALUE============");
int min=arr.stream().min((i1,i2)->i1.compareTo(i2)).get();
System.out.println("MINIMUM:"+min);
System.out.println("FILTER DATA AND STORED INTO ANOTHER ARRAY LIST");
List<Integer> clist=arr.stream().filter(i->i%2==0).collect(Collectors.toList());
clist.stream().forEach(System.out::println);
	}

}
