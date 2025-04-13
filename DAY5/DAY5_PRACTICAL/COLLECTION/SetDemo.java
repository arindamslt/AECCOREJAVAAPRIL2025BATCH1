package COLLECTION;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//HashSet<String> hs=new HashSet<String>();//DATASTRUCTURE HASHTABLE
//LinkedHashSet<String> hs=new LinkedHashSet<String>();//DATASTRUCTURE HASHTABLE+LINKED LIST
TreeSet<String> hs=new TreeSet<String>();// DATASTRUCTURE RED BLACK TREE
hs.add("RAMAN");
hs.add("AYAN");
hs.add("BHASKAR");
hs.add("ANUP");
hs.add("SOUMYA");
hs.add("SUDIP");
hs.add("ANUP");
System.out.println(hs);

	}

}
