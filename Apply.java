import java.util.Scanner;
class Apply
{
    public static void main(String arr[])
    {
        int a;
        Scanner ob =new Scanner(System.in);
        System.out.println("enter a no");
        a=ob.nextInt();

        if(a>=18&&a<=35)
        {
            System.out.println("you apply a job"+a);
        }else{
            System.out.println("you not apply a job"+a);
        }
    }
}