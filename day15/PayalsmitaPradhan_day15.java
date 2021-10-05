import java.util.*;
public class Day15 {

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
		System.out.println(cheat(a));
		}}
	
	public static int cheat( int[] a )
	{
		for (int i = 0; i < a.length; i++) {
            int in = Math.abs(a[i]);
            if (a[in - 1] > 0) {
                a[in - 1] *= -1;
                
            }
        }
		int c=0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
            	 c = (i + 1);
            }
        }
        return c;

	}
}


