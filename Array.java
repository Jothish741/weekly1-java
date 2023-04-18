import java.util.Scanner;
public class Array {
    public static void main(String[] args)
    {
        int a,b,addition,subraction,divide,mulutiple,remainder;
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        addition=a+b;
        subraction=a-b;
        mulutiple=a*b;
        divide=a/b;
        remainder=a%b;
        System.out.println("Addition Value= "+addition);
        System.out.println("Subtraction Value= "+subraction);
        System.out.println("Multiply Value= "+mulutiple);
        System.out.println("Divide Value= "+divide);
        System.out.println("Remainder Value= "+remainder);
    }
}
