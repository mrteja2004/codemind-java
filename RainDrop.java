import java.util.*;
public class Test{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        if(a%3==0)
        System.out.print("Pling");
        if(a%5==0)
        System.out.print("Plang");
        if(a%7==0)
        System.out.print("Plong");
        if(a%3!=0 && a%5!=0 && a%7!=0)
        System.out.print(Integer.toString(a));
    }
}