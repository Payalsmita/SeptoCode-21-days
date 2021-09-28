import java.util.Scanner;
public class Day8 {

	public static void main(String[] args) {
		int t;
		String S;
		Scanner sc = new Scanner(System.in);
        t=sc.nextInt();
        if (t>=1 && t<=5)
        {
        	for(int a=0;a<t;a++)
            {
       	    S=sc.next();int c=0;int d=0;
       	 
       	 for(int i = 0; i < S.length(); i++) 
       	 {
       		 char ch=S.charAt(i);
       		 if(Character.isLowerCase(ch))
       		 {
       			 c++;}
       		 else if (Character.isUpperCase(ch))
       			 {
       				 d++;
       			 }
       	 }
       	 
       	 if(c>d || c == d)
       	 {
       		 S=S.toLowerCase();
       	 }
       	 else if (d>c)
       	 {
       		 S=S.toUpperCase();
       	 }
     	System.out.println( S );
        }}}}


