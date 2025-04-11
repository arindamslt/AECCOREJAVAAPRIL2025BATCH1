package String;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String s=new String("SPRING");
  s.concat("HIBERNATE");
  System.out.println(s);
  //StringBuffer sb1=new StringBuffer("SPRINGBBOOT");
  StringBuilder sb1=new StringBuilder("SPRINGBOOT");
  sb1.append("MICROSERVICE");
  sb1.append("DESIGN PATTERN");
  System.out.println(s);
  System.out.println(sb1);
	}

}
