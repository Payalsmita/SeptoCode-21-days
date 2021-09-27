import java.util.Scanner;
import java.util.regex.Matcher;  
import java.util.regex.Pattern;
public class Day7 {

	public static void main(String[] args) {
		int t,n;
		String S;
		Scanner sc = new Scanner(System.in);
        t=sc.nextInt();
        if (t>=1 && t<=4)
        {
        	for(int a=0;a<t;a++)
            {
       	    n=sc.nextInt();
       	    S=sc.next();
       	    if (n== (S.length()) && 1<=n && n<=100)
       	    {
       	    	
        	   if (Repeat(S) == true )
               System.out.println ("YES");
               else
               System.out.println ("NO");

        }}}}
        public static boolean Repeat(String b)
        {
        	String regex1 = ".*000000.*||.*111111*.";
    
        	Pattern p = Pattern.compile(regex1);
        	Matcher m =p.matcher(b);
        	return m.matches();
        }
        

}