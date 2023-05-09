import java.util.Scanner;
class  Three 
{
    public static void main(String arr[])
    {
        int a,b,c;

        Scanner ob = new Scanner(System.in);
        System.out.println("enter first no");
        a = ob.nextInt();
        System.out.println("enter Second no");
        b = ob.nextInt();
        System.out.println("enter third no");
        c = ob.nextInt();
        if(a>b)
        {
            if(a > c) 
            System.out.println("Largest: " + a); 
            else 
            System.out.println("Largest: " + c); 
            } 
            else 
            { 
            if(b > c) 
            System.out.println("Largest: " + b); 
            else 
            System.out.println("Largest: " + c); 
            } 
            } 
           } 
           