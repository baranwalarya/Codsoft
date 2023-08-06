import java.util.*;
import java.util.Random;

class Number_Game
{
	public static void main(String args[])
	{
		Random ob=new Random();
		Scanner sc =new Scanner(System.in);
		int n;
		int tries=0;
		int right=0;
		int guess;
		boolean Play_again;
		do
		{
			n=ob.nextInt(100);
			
			guess=0;
			Play_again=false;
			while(guess!=n)
			{ 
				System.out.println("Please enter any no. between 1 to 100");
				guess=sc.nextInt();
				tries++;
				if(guess<1||guess>100)
					System.out.println("Invalid inputs");
				else if(guess<n)
					System.out.println("Guessed no. is too low!");
				else if(guess >n)
					System.out.println("Guessed no.is too high!");
			}
			 right++;
			 System.out.println("Congratulations! Guess is matched");
			 System.out.println("No. of tries="+tries);
			 System.out.println("Do u want to play again?");
			 
			switch(sc.next())
			{
			case "yes":Play_again=true;
				break;
			default:
				break;
			}
		}
		
			
			while(Play_again);
			System.out.println("Game end");
	}
}