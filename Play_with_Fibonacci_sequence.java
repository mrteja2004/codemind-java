import java.util.*;
public class main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // int a=sc.nextInt();
       int  a=0;
       int  b=1;
       int  c=a+b;
        for(int i=0;i<n;i++){
            System.out.print(a+" ");
            a=b;
            b=c;
            c=a+b;
        }
        
    }
}