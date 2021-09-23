import java.util.Scanner;

public class Day3 {

	public static void main(String[] args) {
		String s;int i;
		Scanner sc= new Scanner (System.in);
		s= sc.nextLine();
		String[] numbers = s.split(",");
		int l= numbers.length;
	    for(i=0;i<l;i++)
	     {
	    	System.out.println(numbers[i]); 
	     }
		
}
	
}
