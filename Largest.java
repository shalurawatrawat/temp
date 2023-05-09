import java.util.Scanner;
class Larget
{
    public static void main(String arr[])
    {
        int a,b;
        Scanner ob = new Scanner(System.in);

        System.out.print("Enter 1st no. ");
        a = ob.nextInt();

        System.out.print("Enter 2nd no. ");
        b = ob.nextInt();

        if(a>b)
        System.out.print("Largest "+a);
        else
        System.out.print("Largest "+b);

    }
}
