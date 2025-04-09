package OOPS;

public class Lecturer implements Speak,Speak1 {

	@Override
	public void talk() {
		// TODO Auto-generated method stub
		System.out.println("SAYS ABOUT SPECIFIC TOPIC");
	}

	@Override
	public void say() {
		// TODO Auto-generated method stub
		System.out.println("WELCOME");
	}

}
