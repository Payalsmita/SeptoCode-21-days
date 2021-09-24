import java.util.Scanner;

public class Day4 {

	public static void main(String[] args) {
		int n,a;
		 Scanner sc= new Scanner (System.in);
	       n= sc.nextInt();
	       int points[]=new int[n];
	       if (1<=n && n<=100) 
	    	   for (int i=0;i<n;i++)
	    	   {
	    		   a=sc.nextInt();
	    		   System.out.println();
	    		   if(0<=a && a<=100 )
	    			   points[i] = round(a);
	    	   }
	       for (int i=0;i<n;i++)
	       {
	    	   System.out.println(points[i]); 
	       }
	       sc.close();
	}
	public static int round(int a)
	{
		if (a>33)
			{
			if (a%5==4)
				return (a+1);
			else if (a%5==3)
				return (a+2);
			else ;
			return (a);
			}
		else ;
		return (a);
		 
		 
	}
	}


