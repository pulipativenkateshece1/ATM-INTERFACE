package ATMInterface;

public class Account 
{
	String account_holder_name;
	String dateOfBirth;
	int pin_number;
	double money;
	long account_Number;
	public Account(String account_holder_name, String dateOfBirth, int pin_number, double money, long account_Number) {
		super();
		this.account_holder_name = account_holder_name;
		this.dateOfBirth = dateOfBirth;
		this.pin_number = pin_number;
		this.money = money;
		this.account_Number = account_Number;
	}
	public void accountDetails()
	{
		System.out.println(account_holder_name);
		System.out.println(dateOfBirth);
		System.out.println(pin_number);
		System.out.println(money);
		System.out.println(account_Number);
	}

}
