import java.util.*;
public class Day20 {
static void SumPrime(int n)
{   int c =0;
    String sum="";
	if (n % 2 == 1) {
        c++;
		sum=sum+"3"+" ";
		n -= 3;
    }
	while (n>0) {
        c++;
		sum=sum+"2"+" ";
		n -= 2;
	}
    System.out.println(c);
    System.out.println(sum);
}
	public static void main (String[] args) {
	Scanner sc =new Scanner(System.in);
    int t = sc.nextInt();
    for(int i=0;i<t;i++)
    {
        int n =sc.nextInt();
	    SumPrime(n);
	}
    sc.close();
}
}