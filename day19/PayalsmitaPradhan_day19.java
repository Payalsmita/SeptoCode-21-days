import java.util.*;
public class Day19 {
public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int t =sc.nextInt();
    for(int i=0;i<t;i++)
    {
        int n =sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        verify(a);
    }
}
    static void verify(int a[])
{   
    for(int i = 0;i<arr.length-1;i++)
    {
        if(a[i]==a[i+1])
        {
            System.out.println("Gentle");
            break;
        }
    }
    if((i==a.length-1)&&a[i]!=arr[i-1])
    {
        System.out.println("Steep");
    }
}
}


	    
		            
		       
		        

