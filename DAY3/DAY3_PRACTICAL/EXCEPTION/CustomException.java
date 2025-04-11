package EXCEPTION;
class Account
{
	public String accno="100";
	public void checkAccount(String accno)
	{
		try
		{
		if(this.accno.equals(accno))
		{
			System.out.println("ACCOUNT EXISTS"+this.accno);
		}
		else
		{
			AccountNotFoundException ae=new AccountNotFoundException();
			throw ae;
		}
		}
		catch(AccountNotFoundException ae)
		{
			ae.printStackTrace();
		}
	}
	}
public class CustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Account acn=new Account();
 acn.checkAccount("100");
	}

}
