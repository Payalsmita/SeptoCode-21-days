import java.util.*;
public class Day14 {

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
		int c = largest(a);
		System.out.println(c+1);
		}
	}
	public static int largest( int[] array )
	{
	  if ( array == null || array.length == 0 ) return -1; 

	  int l = 0;
	  for ( int i = 1; i < array.length; i++ )
	  {
	      if ( array[i] > array[l] ) l = i;
	  }
	  return l; 
	}
}
