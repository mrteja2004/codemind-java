import java.util.*;
public class Test{
    public static void main(String[] args){
        Scanner op=new Scanner(System.in);
        int n =op.nextInt();
        for(int i=1;i<=n;i++){
            int x=op.nextInt();
            int y=op.nextInt();
            int z=(x/y)+(x%y);
            System.out.println(z);
        }
    }
}