package JAVA8;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String[] s=new String[5];
 // String s1=s[2].toUpperCase();
  //System.out.println(s1);
  Optional<String> o=Optional.ofNullable(s[2]);
  if(o.isPresent())
  {
	  String s3=s[2].toUpperCase();
	  System.out.println(s3);
  }
  else
  {
	  System.out.println("NO VALUE");
  }
	}

}
