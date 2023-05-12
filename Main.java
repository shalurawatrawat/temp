import java.util.Scanner;
class Main
{
public static void main(String arr[])
    {
        int a,i=1;
        Scanner ob=new Scanner(System.in);
         System.out.println("enter no");
        a=ob.nextInt();
        while(i<=10)
        {
            System.out.println(a+"*"+i+"="+a*i);
            i++;
        }
        
    }
        }