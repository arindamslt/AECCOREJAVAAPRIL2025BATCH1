package COLLECTION;

import java.util.LinkedList;
import java.util.Stack;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    LinkedList<String> ls=new LinkedList<String>();
    ls.add("NAYAN");
    ls.add("RUPAM");
    ls.add("ANNANYA");
    ls.add("JAYANTA");
    ls.add("RUPAM");
    ls.add(3,"AJOY");
    ls.remove(2);
    for(Object o:ls)
    {
    	System.out.println(o);
    }
    
	}

}
