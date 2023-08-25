import java.util.*;
public class Test{
    public static void main(String[] args ){
        Scanner op = new Scanner(System.in);
        float a= op.nextFloat();
        float  b= op.nextFloat();
        float c= op.nextFloat();
        float s=(a+b+c)/2;
        double d=(Math.sqrt(s*(s-a)*(s-b)*(s-c)));
        System.out.printf("%.2f",d);
    }
}