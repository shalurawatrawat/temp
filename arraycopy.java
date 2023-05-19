import java.util.*;
public class Main
{
public static void main (String[] args) 
{
    int a[]={2,3,4,5,6,5,4,3,2,1};
    int b[]=new int[10];
     int c[]=new int[10];
    System.arraycopy(a,0,b,0,3);
    for(int i:b)
    System.out.println(i);
    System.arraycopy(a,2,c,3,4);
    for(int i:c)
    System.out.println( i+ " ");
}
}