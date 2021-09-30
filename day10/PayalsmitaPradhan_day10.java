import java.util.*;
public class Day10 {

	public static void main(String[] args) {
		int t;
		String S;
		Scanner sc = new Scanner(System.in);
        t=sc.nextInt();
        if (t>=1 && t<=10)
        {
        	for(int a=0;a<t;a++)
            {
       	    S=sc.next();
        	if (repeat(S))
        	{
        		System.out.println("PASS");
        	}
        	else
        	{
				System.out.println("FAIL");
			}
        	

	}}}
        	public static boolean repeat(String S)
        	{
        		int b=0;
        		boolean[]check = new boolean[26];
        		 for (int i = 0; i < S.length(); i++) {
        	            if (i + 1 < S.length() && S.charAt(i) != S.charAt(i + 1))
        	            {
        	            if ('a'<= (S.charAt(i)) && ( S.charAt(i)) <= 'z') {
        	            	b= S.charAt(i)-'a';
        	            }
        	            check[b]= true;
        	            	
        	            }}
        		 for(int j=0;j<26;j++ )
        		 {
        			 if(!check[j])
        			 {
        				 return false;
        			 }
        			 }
        	            return true;
                        }}