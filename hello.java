import java.util.*;
class Demo
{
    public static void main(String uu[])
    {
        int a,b,c;
        Scanner ob=new Scanner(System.in);
       System.out.printf("enter a no");
       a=ob.nextInt();
       System.out.print("enter 2second no"
       b=ob.nextInt();
       System.out.print("enter 3thred no");
       c=ob.nextInt();
       System.out.println("before Swapping");
       System.out println("a"+a);
       System.out println("b"+b);
       System.out println("c"+c);
       a=b+c;
       b=a-b;
       a=a-b;
       System .out.println ("After Swapping");
       System .out.println("a"+a);
        System .out.println("b"+b);
         System .out.println("c"+a);
    }
}