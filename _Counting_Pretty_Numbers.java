import java.util.*;
public class Test{
    public static void main(String[] Args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++) 
        {
            int c=0;
            int a=sc.nextInt();
            int b=sc.nextInt();
            for(int j=a;j<=b;j++)
            {
                int k = j%10;
                if(k==2|| k==3|| k==9)
                {
                    c++;
                }
            }
            System.out.println(c);
        }
    }
}