import java.util.Scanner;
class Bill
{
    public static void main (String arr[])
    {
        int a;
        Scanner ob =new Scanner(System.in);
        System.out.println("enter a no");
        a = ob.nextInt();
        if(a<=50)
        {
	    a=0*a;
            System.out.println("Total bill"+a);
	}
            else if (a<=200)
            {
                a=5*a;
                System.out.println("Total bill"+a);
            }
            else if(a<=500)
            {
                a=8*a;
                System.out.println("Total bill"+a);

            }else
            {
            a=10*a;
            System.out.println("Total bill"+a);
        }
    }
        
    }