package JavaAssingment;
  import java.util.Scanner;

public class InputIsPangramOrNot
{
    public static void main(String[] args) 
    {
    	  Scanner sc = new Scanner(System.in);
    	  System.out.println("Enter a Input you want to check : ");  	
    	  String s = sc.nextLine();    	    
    	    if (isPangram(s))
    	    {
    	       System.out.println("The input is a pangram.");
    	    } 
    	    else 
    	    {
    	        System.out.println("The input is not a pangram.");
    	    }
    }

    public static boolean isPangram(String s)
    {
        if(s.length() < 26)
        {
        	return false;
        }
        else
        {
        	for(char ch = 'a'; ch <= 'z'; ch++)
        	{
        		if(s.indexOf(ch) < 0)
        		{
        			return false;
        		}
        	}
        }
        return true;
    }
}
