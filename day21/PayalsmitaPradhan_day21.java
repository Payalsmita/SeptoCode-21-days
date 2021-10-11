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
	        static void yeast(int n){
	            int c = 0;
	            for (int i = n; i > 0; i/=2) {
	                c+= i%2;
	            }
	            System.out.println(c);
	        }
	    }          