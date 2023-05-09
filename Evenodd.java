import java.util.Scanner;

 class Evenodd {

   public static void main(String arr[])
{
    int a;
    Scanner ob = new Scanner(System.in);
    System.out.println("enter a no");
    a=ob.nextInt();
    if(a%2==0)
    {
       System.out.println("even"+a);
     }
     else
    {
         System.out.println("odd"+a);
    }

}
}