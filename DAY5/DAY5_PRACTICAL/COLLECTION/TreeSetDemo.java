package COLLECTION;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    TreeSet<String> hs=new TreeSet<String>(new TestComparator());
    hs.add("RAMAN");
    hs.add("AYAN");
    hs.add("BHASKAR");
    hs.add("ANUP");
    hs.add("SOUMYA");
    hs.add("SUDIP");
    hs.add("DIBENDU");
    System.out.println(hs);
	}

}
