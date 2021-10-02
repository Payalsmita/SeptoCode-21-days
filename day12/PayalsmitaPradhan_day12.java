import java.util.*;
public class day12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int b= 0;b<t;b++) {
		int n = sc.nextInt();
		int[][]a = new int [n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
		add (a,n);
		}
        
	}
	public static void add (int a[][],int n)
	{
		int sum = 0;int sum2 = 0;
		for (int i =0;i<n;i++){
			 sum = sum+ a[0][i]+ a[n-1][i];
			 sum2 = sum2 + a[i][0]+a[i][n-1];}
		     System.out.println (Math.abs(sum-sum2));
	}
	}
	
	
	
	
	
	

		
