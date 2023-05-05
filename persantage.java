import java.util.*;
class Number
{
    public static void main(String uu[])
    {
    int hindi,english,Maths,totle;
    float persantag;
        Scanner ob=new Scanner(System.in);
       System.out.print("enter hindi makes");
       hindi=ob.nextInt();
       System.out.print("enter english makes");
       english=ob.nextInt();
       System.out.print("enter mathe makes");
       Maths=ob.nextInt();
       persantag=totle/300;
      totle=hindi+english+Maths;
     System.out.println("persantag"+persantag);
      System.out.println("totle makes" +totle);
      
      
    }
}