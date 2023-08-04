import java.util.*;
class ATM     //ATM class, declaring option withdraw,deposit,amount
{   
	double withdraw,deposit;
	double amount;
		Scanner sc=new Scanner(System.in);
		//Function to check the balance
		public void Checkbalance()
		{
			System.out.println("The current balance is = "+ amount);
			System.out.println();
		}

		//Function to withdraw amount
		public void withdraw(double a)
		{
			
			if(amount>=a)
			{
				amount=amount-a;
				System.out.println("Please collect your money");
			}
			else
			{
				System.out.println("Insufficient money");
				System.out.println();
			}	
		}
	
		//Function to deposit amount
		public void deposit(double a)
		{
			amount=amount+a;
			System.out.println("Your amount has been successfully deposited");		
		}
	
}

class Codsoft extends ATM
{
	public static double deposit;
	public static double withdraw;
	public static void main(String args[])
	{
		Codsoft ob=new Codsoft();
	    Scanner sc=new Scanner(System.in);	
		System.out.println("WELCOME TO ATM");
		System.out.println(".................");		
		while(true)
		{	
			
			System.out.println("Choose 1 for check balance");
			System.out.println("Choose 2 withdraw");
			System.out.println("Choose 3 for deposit");
			System.out.println("Choose 4 for exit");
			System.out.println("Choose the options for moving toward: ");
			int n=sc.nextInt();
			switch(n)
			{
				case 1: ob.Checkbalance();
						System.out.println(" ");
						break;
				case 2: System.out.println("Enter the amount to withdraw");
						withdraw=sc.nextDouble();
						ob.withdraw(withdraw);
						break;
				case 3: System.out.println("Enter the amount to deposit");
						deposit=sc.nextDouble();
						ob.deposit(deposit);
						break;
				case 4: System.exit(0); 
			}
		}
	}
}