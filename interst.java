import java.util.*;
class Simple
{
    public static void main(String uu[])
    {
        float per,r ,si,t;
        Scanner ob=new Scanner(System.in);
       System.out.print("enter  per ,r,time");
       per=ob.nextInt();
        r=ob.nextInt();
         t=ob.nextInt();
      si=per*r*t/100;
      System.out.println("simple interst" +si);
    }
}