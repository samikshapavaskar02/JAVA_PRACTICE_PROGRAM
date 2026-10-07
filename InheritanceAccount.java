class Account
{
	private long accNo;
	private String name;
	private String address;
	private long phone;
	private String dob;
	private int pin;
	private int balance;
	
	public Account(long accNo,String name,String address,long phone,String dob,int pin,int balance)
	{
		this.accNo = accNo;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.dob = dob;
		this.pin = pin;
		this.balance = balance;
	}
	
	public long getaccNo()
	{
		return accNo;
	}
	
	public void setaccNo(long newAccNo)
	{
		accNo = newAccNo;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String newName)
	{
		name = newName;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public void setAddress(String newAddress)
	{
		address = newAddress;
	}
	
	public long getPhone()
	{
		return phone;
	}
	
	public void setPhone(long newPhone)
	{
		phone = newPhone;
	}
	
	public String getDob()
	{
		return dob;
	}
	
	public void setDob(String newDob)
	{
		dob = newDob;
	}
	
	public int getPin()
	{
		return pin;
	}
	
	public void setPin(int newPin)
	{
		pin = newPin;
	}
	
	public int getBalance()
	{
		return balance;
	}
	
	public void setBalance(int newBalance)
	{
		balance = newBalance;
	}
	
	public void close()
    {
        balance = 0;
        System.out.println("Account closed successfully.");
    }	
}

class SavingAccount extends Account
{
	public SavingAccount(long accNo, String name, String address,long phone, String dob, int pin, int balance)
    {
        super(accNo, name, address, phone, dob, pin, balance);
    }
	
	public void deposit(int amount)
	{
		setBalance(getBalance() + amount);
	}
	
	public void withdraw(int amount)
	{
		setBalance(getBalance() - amount);
	}
}

class LoanAccount extends Account
{
	public LoanAccount(long accNo, String name, String address,long phone, String dob, int pin, int balance)
    {
        super(accNo, name, address, phone, dob, pin, balance);
    }
	
	public void payEMI(int amount)
	{
		setBalance(getBalance() - amount);
	}
	
	public void repay(int amount)
	{
		setBalance(getBalance() - amount);
	}
}

public class InheritanceAccount
{
	public static void main(String args[])
	{
		// Creating SavingAccount object
		SavingAccount s = new SavingAccount(100,"Chaitu","Satara",97531468,"5/07/2004",5678,7000);
		s.setaccNo(101);
		s.setName("Samiksha");
		s.setAddress("Kolhapur");
		s.setPhone(987654320);
		s.setDob("15/08/2004");
		s.setPin(1234);
		s.setBalance(5000);
		
		System.out.println("Account Number : " + s.getaccNo());
        System.out.println("Name           : " + s.getName());
        System.out.println("Address        : " + s.getAddress());
        System.out.println("Phone          : " + s.getPhone());
        System.out.println("DOB            : " + s.getDob());
        System.out.println("PIN            : " + s.getPin());
        System.out.println("Balance        : " + s.getBalance());
		
		System.out.println();
		
		// Deposit
        s.deposit(2000);
        System.out.println("After Deposit  : " + s.getBalance());

        // Withdraw
        s.withdraw(1000);
        System.out.println("After Withdraw : " + s.getBalance());

        // Close account
        s.close();
        System.out.println("Final Balance  : " + s.getBalance());
		
		// Creating LoanAccount object
        LoanAccount l = new LoanAccount(100,"Chaitu","Satara",97531468,"5/07/2004",5678,7000);
		
		 // Pay EMI
        l.payEMI(5000);
        System.out.println("After EMI           : " + l.getBalance());

        // Repay loan
        l.repay(10000);
        System.out.println("After Repayment     : " + l.getBalance());
		
	}
}
