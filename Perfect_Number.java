import java.util.*;
public class main{
    public static void main(String Args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int sum=0;
        for(int i=1; i<a;i++){
            if(a%i==0){
                sum  += i;
            }
        }
        if(sum == a){
            System.out.print("True");
        }
        else{
            System.out.print("False");
        }
    }
}