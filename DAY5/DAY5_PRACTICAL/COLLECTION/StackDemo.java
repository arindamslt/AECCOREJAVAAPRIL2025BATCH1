package COLLECTION;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Stack<String> st=new Stack<String>();
   st.add("NAYAN");
   st.add("RUPAM");
   st.add("ANNANYA");
   st.add("JAYANTA");
   st.add("RUPAM");
   st.push("RAVI");
   st.pop();//REMOVE THE TOP MOST ELEMENT
   System.out.println(st);
   for(Object o:st)
   {
	   System.out.println(o);
   }
	}

}
