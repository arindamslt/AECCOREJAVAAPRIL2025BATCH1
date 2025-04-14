package JAVA8;

import java.util.Optional;

public class OptionalClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String[] str=new String[5];
  //String s=str[2].toUpperCase();
  //System.out.println(s);
  Optional<String> o=Optional.ofNullable(str[2]);
  if(o.isPresent())
  {
	  String s=str[2].toUpperCase();
	  System.out.println(s);
  }
  else
  {
	  System.out.println("str[2] HAS NO DATA");
  }
  
	}

}
