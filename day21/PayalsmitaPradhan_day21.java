import java.util.*;
public class Day21 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
	    int t =sc.nextInt();
	    for(int i=0;i<t;i++)
	    {
	        int n =sc.nextInt();   
            yeast(n);
	    }

}
	public static void yeast(int a)
	{  
			if(a % 2!=0){  
			System.out.println("2");  
			}   
			if(a % 2==0){  
			System.out.println("1");  
			}    
	}
}
