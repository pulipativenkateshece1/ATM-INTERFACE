package ATMInterface;

public class Bank 
{
	String bank_name;
	String location;
	String ifsc_code;
	Account account;
	public Bank(String bank_name, String location, String ifsc_code) {
		super();
		this.bank_name = bank_name;
		this.location = location;
		this.ifsc_code = ifsc_code;
	}
	public void bankDetails()
	{
		System.out.println("Bank Name : "+bank_name);
		System.out.println("Location : "+location);
		System.out.println("IFSC Code :"+ifsc_code);
		
		if(account != null)
		{
			System.out.println("Account Holder Name : "+account.account_holder_name);
			System.out.println("Date of Birth: "+account.dateOfBirth);
			System.out.println("PIN Number: "+account.pin_number);
			System.out.println("Money: "+account.money);
		}
		else
		{
			System.out.println("Open Your Account first..");
		}

	}
	public void createAccount(Account account)
	{
		if(this.account == null)
		{
			this.account =account;
			System.out.println("Account Successfully create");

		}
		else
		{
			System.out.println("Already Account is existing ");
		}

	}
	public void Deposite(long account_Number, double money)
	{
		if(account.account_Number == account_Number)
		{
			if(money !=0)
			{
				account.money = account.money+money;
				System.out.println("Depoosite money is :" +money);
				System.out.println("Total Balance is : "+account.money);

			}
			else
			{
				System.out.println("Enter a Valid amount to add in account");
			}
		}
		else
		{
			System.out.println("Enter valid account number");
		}

	}
	public void WithDraw(long account_Number, double money)
	{
		if(account.account_Number == account_Number)
		{
			if(account.money >= money)
			{
				account.money=account.money+money;
				System.out.println("Withdraw amount is "+money);
				System.out.println("Total Balance is : "+account.money+account.money);
			}
			else
			{
				System.out.println("Enter the Valid amount to add in account");
			}

		}
	}
	public double checkBalance(double money)
	{
		return account.money;
	}
	public void DeleteAccount()
	{
		this.account=null;
		System.out.println("Account Deleted");
	}
	


}
