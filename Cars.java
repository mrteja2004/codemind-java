import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int x=sc.nextInt();
        // System.out.printf("%d	%d	%d",n1,n2,x);
        if(n1 > n2)
        System.out.print(-1);
        else{
            int n = n2 - n1;
            System.out.print((int) x/n + 1);
        }
        
    }
}