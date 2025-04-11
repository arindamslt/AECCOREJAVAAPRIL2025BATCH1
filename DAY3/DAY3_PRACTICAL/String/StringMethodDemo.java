package String;

public class StringMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String s="";
  System.out.println(s.isEmpty());
  String s2="abcabccabbac";
  System.out.println(s2.replace('c','d'));
  String s3=" SUMAN ";
  System.out.println(s3);
  System.out.println(s3.trim());
  String s4="TEST";
  System.out.println(s4.indexOf("T"));
  System.out.println(s4.lastIndexOf("T"));
  String s5="BANGALORE";
  System.out.println(s5.substring(5,7));
  System.out.println(s5.charAt(3));
  String s6="HELLO,HOW ARE YOU,I AM FINE";
  String[] st=s6.split(",");
  for(String sb:st)
  {
	  System.out.println(sb);
  }
 
  
	}

}
