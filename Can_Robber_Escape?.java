import java.util.*;
public class Test{
    public static void main(String[] args){
        Scanner op= new Scanner(System.in);
        int n=op.nextInt();
        int c = 0;
        for(int i=1;i<=n;i++){
            int a=op.nextInt();
            if(a>=n){
                System.out.print("NO");
                c = 1;
                break;
            }
        }
        if ( c == 0)
        {
            System.out.println("YES");
            
        }
    }
}