import java.util.*;
public class Day16 {
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
            int c = Count(a,n);
            System.out.println(c+1);
        }
    
    }
         public static int Count(int a[], int n)
        {
            int e = 0;
            int o = 0;
            for (int i = 0; i < n; i++) {
                if ((a[i] & 1) == 0) 
                   {
                        e++;
                   }
                 else
                  { 
                    o++;
                  }
                
            }
            if (o>e) 
        {   
            int i;
            for(i=0;i<n;i++)
            {
                if(a[i]%2==0)
                break;
            }
            return i;
        }
            else
          {
                int i;
            for(i=0;i<n;i++)
            {
                if(a[i]%2!=0)
                break;
            }
            return i;
        }
        } 
}
