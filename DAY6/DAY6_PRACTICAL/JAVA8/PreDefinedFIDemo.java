package JAVA8;

import java.time.LocalDate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PreDefinedFIDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Predicate<Integer> p=i->i%2==0;
  System.out.println(p.test(10));
  System.out.println(p.test(5));
  Function<String,Integer> f=s->s.length();
  System.out.println(f.apply("SUMAN"));
  Function<String,String> f2=s->s.toUpperCase();
  System.out.println(f2.apply("aloke"));
  Consumer<String> c=s->System.out.println(s);
  c.accept("CONSUMER INTERFACE");
  Supplier<LocalDate> s=()->LocalDate.now();
  System.out.println(s.get());
  StringBuffer sb=new StringBuffer();
  
  /*Function<StringBuffer,StringBuffer> fs=sbs->sbs.reverse();
  StringBuffer sbf=new StringBuffer("RAMAN");
  System.out.println(fs.apply(sbf));*/
  Function<StringBuffer,String> fs=sbs->sbs.reverse().toString();
  StringBuffer sbf=new StringBuffer("RAMAN");
  System.out.println(fs.apply(sbf));
  
  
  
  

  
	}

}
