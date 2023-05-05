import java.util.*; 
class Swaptwo
{ 
 public static void main(String arr[]) 
 { 
 int a, b; 

Scanner ob =new Scanner(System.in);
System.out.print("enter first no");
a=ob.nextInt();
System.out.print("enter second no");
b=ob.nextInt();
System.out.print("after swaping");
System.out .print("a"+a);
System.out.print("b"+b);
a=a+b;
b=a-b;
a=a-b;
System.out.print("before swaping");
System.out.print("a"+a);
System .out.print("b"+b);
 } 
}