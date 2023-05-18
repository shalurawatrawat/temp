import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int arr[],size,i;
		Scanner ob = new Scanner(System.in);
		System.out.print("Enter the Size :");
		size = ob.nextInt();
		arr = new int[size];
		System.out.println("Enter Values :");
		for(i=0;i<size;i++)
		{
		    arr[i] = ob.nextInt();
		}
		for(i=0;i<size;i++)
		{
		    System.out.println("print valuea :"+arr[i]);
		}
	}
}
