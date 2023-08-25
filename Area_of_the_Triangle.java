import java.util.Scanner;
public class Test{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        float a = inp.nextFloat();
        float b = inp.nextFloat();
        float c = inp.nextFloat();
        float s = (a + b + c) / 2;
        System.out.printf("%.2f",Math.sqrt(s * (s - a) * (s - b) * (s - c)));
    }
}