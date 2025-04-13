package COLLECTION;
import java.util.*;
public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// ArrayList arr=new ArrayList();//arr is Collection
		Vector arr=new Vector();
 //Integer n=new Integer(10);
 arr.add(10);
 arr.add(15);
 arr.add(25);
 arr.add(30.5);
 arr.add(5);
 arr.add("ROBIN");
 arr.add(25);
 System.out.println(arr);
 arr.add(2,"RAMAN");//adding in 2 index
 System.out.println(arr);
 arr.remove(2);
 System.out.println(arr);
// Collections.sort(arr);
 System.out.println(arr);
 //TRAVESE THE ELEMENT IN COLLECTION
 Iterator itr=arr.iterator();
 while(itr.hasNext())
 {
	 System.out.println(itr.next());
 }
 // FOR EACH LOOP
 for(Object o:arr)
 {
	 System.out.println(o);
 }
	}

}
