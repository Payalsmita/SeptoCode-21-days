import java.util.*;
public class Day17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int b= 0;b<t;b++) {
        int n = sc.nextInt();
        lucky(n);       	
	}

}
	static int sum(int n)
	{
	    int s = 0;
	    while (n > 0)
	    {
	        int d = n % 10;
	        s += d * d;
	        n = n / 10;
	    }
	    return s;
	}
	 public static void lucky (int n)
	    {
	        while (n!=1 && n!=4)
	        	n=sum(n);
	        {
	            if (n == 1)
	                System.out.println("lucky");
	            else if (n == 4)
	            	System.out.println("unlucky");
	                
	        }
	     
	    }
}
	
