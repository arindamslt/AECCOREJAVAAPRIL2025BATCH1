package COLLECTION;
import java.util.*;
public class ArrayListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> arr=new ArrayList<Integer>();//GENERICS
ArrayList<String> arr1=new ArrayList<String>();//GENERICS
arr.add(10);
arr.add(25);
arr.add(15);
arr.add(30);
arr.add(5);
arr1.add("SUMAN");
for(Object o:arr)
{
	System.out.println(o);
}
	}

}
