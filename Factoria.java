import java.util.*;
class Factoria
{
  public static void main(String arr[])
  {
    int i,n,fact=1;
    Scanner ob = new Scanner(System.in);
  
      System.out.print("Enter a no..");
      n = ob.nextInt();
      for(i=1;i<=n;i++){
      fact =  fact*i;
    }
     System.out.print(fact);
}
  }


