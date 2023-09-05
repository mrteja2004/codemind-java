import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String c=sc.nextLine();
        String b=sc.nextLine();
        int a=sc.nextInt();
        double d;
        if(a<=199){
            d=(a*1.20)+100;
        }
        else if(a>199 && a<400){
            d=(a*1.50)+100;
        }
        else if(a>=400 && a<600){
            d=(a*1.80);
            d=d+d*(0.15);
        }
        else{
            d=(a*2.00);
            d=d+d*(0.15);
        }
        System.out.printf("%.2f",d);
   }
}