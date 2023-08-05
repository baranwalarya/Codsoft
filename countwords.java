import java.util.*;
class countwords
 {
   public static void main(String args[])
    {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the sentence");
	  String s=sc.nextLine();
	 // System.out.println(s.isEmpty());
	  
	   if(s.isEmpty())
	   {
		   System.out.println(s.isEmpty());
	   }
		else
		{
			int count=0;	
			for(int i=1;i<s.length()-1;i++)
			{
				char c=s.charAt(i);
				if(c==' ')
				count++;
			}
				System.out.println("Total words="+(count+1));
		}
    }
 }