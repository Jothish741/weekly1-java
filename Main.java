import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        int a,b;
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        if(a==b)
        {
            System.out.println("Two Numbers are Equal.");
        }
        if(a!=b)
        {
            System.out.println("Two Numbers are Not Equal.");
        }
        if(a>b)
        {
            System.out.println("A is Greater than B.");
        }
        if(a<b)
        {
            System.out.println("A is Less than B.");
        }
        if(a>=b)
        {
            System.out.println("A is Greater than or Equal to B.");
        }
        if(a<=b)
        {
            System.out.println("A is Less than or Equal to B.");
        }

    }
}
