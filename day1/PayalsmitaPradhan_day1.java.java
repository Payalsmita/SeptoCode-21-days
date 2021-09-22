import java.util.Scanner;
public class dayone {

	public static void main(String[] args) 
	{
		int n,a,b,c;
		 Scanner sc= new Scanner (System.in);
	       n= sc.nextInt();
	       int score[]=new int[n];
	       if (1<=n && n<=100) 
		   for( int i=0;i<n;i++)
		   {
		         a= sc.nextInt();
		         b= sc.nextInt();
		         c= sc.nextInt();
		         System.out.println();
		         if (1<=a && a<=1000 && 1<=b && b<=1000 && 1<=c && c<=1000)
		         score[i]=result(a,b,c);
		   }
	       for (int i=0;i<n;i++)
	       {
	    	   System.out.println(score[i]); 
	       }
	       sc.close();
	}
	public static int result(int a,int b,int c)
	{
		             int result = a+(b*c/a)-b;
		             return result;
	}
}

		             
		   
        
       
        
         
        
  