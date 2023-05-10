import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
class Demo
{
    public static void main(String arr[])
    {
        int a,b,c,d;
        Scanner ob=new Scanner(System.in);
        System.out .println("enter  first no");
        a=ob.nextInt();
        System.out .println("enter second no");
        b=ob.nextInt();
        System.out .println("enter threed no");
        c=ob.nextInt();
        System.out.println("enter four no");
        d=ob.nextInt();
        if(a>b)
        {
            if(a>c)
        
        {
            System.out.println("largest"+a);
        }
            else
            {
            System.out.println("largest"+b);

        }
    }
         if(b>c)
        {
            {
                if(b>d)
            
            System.out.println("largest"+c);
        }
    }
         else
         {
            System.out.println("largest"+d);

        }  
    

    }
}

