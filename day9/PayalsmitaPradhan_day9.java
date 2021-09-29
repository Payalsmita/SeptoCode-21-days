import java.util.Scanner;

public class Day9 {

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
        	String S1= remove(S);
        	int c = (S.length())-(S1.length());
        	System.out.println(c);

	}}

}
	public static String remove(String S)
	{
		if(S.length()<=1)
            return S;
        if(S.charAt(0)==S.charAt(1))
            return remove(S.substring(1));
        else
            return S.charAt(0) + remove(S.substring(1));
	}}
