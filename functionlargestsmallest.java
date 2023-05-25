import java.util.Scanner;
public class SSS
{
    public static void main (String arr[])
    {
       
     fun1();
     fun2();

    }
    static void fun1()
    {
     int a,b;
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter two no..");
        a = ob.nextInt();
        b = ob.nextInt();
        if(a>b)
        {
            System.out.println("largest "+a);
        }
        else{
           System.out.println("largest "+b);

        }
    }
    static void fun2()
    {
    
     int a,b;
    Scanner ob = new Scanner(System.in);
    System.out.println("Enter Two no...");
    a = ob.nextInt();
    b = ob.nextInt();
    if(a>b)
    {
        System.out.println("Smallest  = " +b);
    }
    else
    {
    System.out.println("Smallest  = " +a);
    }
    }
}