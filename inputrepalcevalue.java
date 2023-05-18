import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    int arr[];
	    int size,i,search,count=0,repalce;
	    Scanner ob=new Scanner(System.in);
		System.out.println("enter a size");
		size=ob.nextInt();
		arr=new int[size];
		for(i=0;i<size;i++)
		{
		    System.out.print("enter a value:");
		    arr[i]= ob.nextInt();
		}
		for(i=0;i<size;i++)
		{
		    System.out.println("print value "+arr[i]);
		}
		System.out.print("enter a search value:");
		search=ob.nextInt();
			for(i=0;i<size;i++)
			{
			    if(arr[i]==search)
			    {
			        count++;
			    }
			}
			System.out.println("count value "+count);
			System.out.print("enter a repalce value:");
		repalce=ob.nextInt();
		for(i=0;i<size;i++)
		{
			    if(arr[i]==search)
			    {
			        arr[i]=repalce;
			    }
			}
				for(i=0;i<size;i++)
		{
		    System.out.println("print value "+arr[i]);
		}
	}
	
}
