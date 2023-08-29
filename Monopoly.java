import java.util.*;
public class Test{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int m;
        if(a>b && a>c)
        m=a;
        else if(b>a && b>c)
        m=b;
        else m=c;
        int res=(a+b+c)-m;
        if(res<m)
        System.out.println("YES");
        else
        System.out.println("NO");
        }
    }
}