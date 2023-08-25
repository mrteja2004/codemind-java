import java.util.*;
public class mahi{
    public static void main(String[] args){
        Scanner ma=new Scanner(System.in);
        int a=ma.nextInt();
        for(int i=1;i<=a;i++)
        {
            String b=ma.next();
            int c=Integer.parseInt(b,8);
            String d=Integer.toString(c,2);
            System.out.println(d);
        }
    }
}
