package hackerrank;

import java.util.Scanner;

public class datatypes {

	 public static void main(String []argh)
	    {



	        Scanner s = new Scanner(System.in);
	        int t=s.nextInt();

	        for(int i=0;i<t;i++)
	        {

	            try
	            {
	                long x=s.nextLong();
	                System.out.println(x+" can be fitted in:");
	                if(x>=Byte.MIN_VALUE && x<=Byte.MAX_VALUE)
	                	{
	                	System.out.println("* byte");
	                	}
	                if(x>=Short.MIN_VALUE && x<=Short.MAX_VALUE)
                	{
                	System.out.println("* short");
                	}
	                if(x>=Integer.MIN_VALUE && x<=Integer.MAX_VALUE)
                	{
                	System.out.println("* int");
                	}
	                if(x>=Long.MIN_VALUE && x<=Long.MAX_VALUE)
                	{
                	System.out.println("* long");
                	}
	                
	            }
	            catch(Exception e)
	            {
	                System.out.println(s.next()+" can't be fitted anywhere.");
	            }

	        }

	}

}
