import java.util.Scanner;

public class Day2 {

	public static void main(String[] args) {
		int n,a,b;
		 Scanner sc= new Scanner (System.in);
	       n= sc.nextInt();
	       int score[]=new int[n];
	       if (1<=n && n<=100) 
		   for( int i=0;i<n;i++)
		   {
		         a= sc.nextInt();
		         b= sc.nextInt();
		         System.out.println();
		         if (2000<=a && a<=3000 && 2000<=b && b<=3000 )
		         score[i]=days(a,b);
		   }
	       for (int i=0;i<n;i++)
	       {
	    	   System.out.println(score[i]); 
	       }
	       sc.close();
	}
	public static int days(int a,int b)
	{
		         int days = check(a)+check(b);
		          return days;
	}
	public static int check(int x)
	{
		 if (x%4==0)
		 {
			 if (x%100!=0 || x%400==0)
                 return 366;
             else;
                 return 365;}

         else;
                 return 365;    
		 }
		

	}


