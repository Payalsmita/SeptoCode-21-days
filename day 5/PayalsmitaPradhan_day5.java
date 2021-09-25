import java.util.Scanner;
public class Day5 {

	public static void main(String[] args) {
		int t,n,a,b;
		Scanner sc = new Scanner(System.in);
         t=sc.nextInt();
         if (1<=t && t<=10)
         {
         
            for(a=0;a<t;a++)
             {
        	    n=sc.nextInt(); 
        	 
        		 int arr[]=new int[n];
                 for(b=0;b<n;b++)
                 {
        	        arr[b]=sc.nextInt();
        	
                 }
                  Repeat(arr,n);
        
        	 }}}
        public static void Repeat(int c[],int x)
        {
            int count;
            for(int i=0;i<x;i++)
           {
               count=0;
               for (int j = 0; j < x; j++)
               {
                  if(c[i]==c[j] && i!=j)
                         count++;
               }
            if(count==0)
            {
            	System.out.print(c[i]+" ");
            	count =0;
           }}
            System.out.println();
         
        	 }
        }

         

        
           