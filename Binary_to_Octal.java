import java.util.*;
public class Test{
    public static void main(String[] args){
        Scanner op = new Scanner(System.in);
        int n=op.nextInt();
        for(int i=1;i<=n;i++)
        {
        String a=op.next();
        int b=Integer.parseInt(a,2);
        System.out.println(Integer.toString(b,8));
        }
        
    }
}