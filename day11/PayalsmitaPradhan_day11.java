import java.util.Scanner;
public class Day11 {
 
	          public static void main(String[] args) {
				int t;
				int n;
				Scanner sc = new Scanner(System.in);
		        t=sc.nextInt();
		        if (t>=1 && t<=100)
		        {
		        	for(int a=0;a<t;a++)
		            {
		       	    n=sc.nextInt();
		       	    int c=0;
		       	    while (n!=1)
		       	    {
		       	    	n = n/2 ;
		       	    	c=c+1;
		       	    }
		       	    System.out.println(c);
		       	    
		            }
		        }
			}

				
			
				

	

}
