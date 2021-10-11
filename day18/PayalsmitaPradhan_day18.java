import java.util.Scanner;
public class Day18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int b= 0;b<t;b++) {
		int n = sc.nextInt();
		int[]a = new int [n];
		for(int i=0;i<n;i++)
        {
                a[i]=sc.nextInt();
        }
		int[] r = new int[n+1];
		for (int i : a) 
		{ 
			r[i] = 1; 
			} 
		 for (int i = 1; i < r.length; i++) 
		 {
			 if (r[i] == 0) 
			 {
				 System.out.print(i+ " ");
			 } 
			 
		 }
		 System.out.println();
		}
	}
}
	  