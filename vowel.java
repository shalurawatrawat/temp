import java.util.Scanner;
class Vowle
{
    public static void main(String arr[])
    {
        Scanner ob =new Scanner(System.in);
        System.out.println("enter a charter");
        char ch = ob.next().charAt(0); 
        {
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        {

            System.out.println("thise is vowel"+ch);
        }else{
            System.out.println(" thise is consonet"+ch);

        }
        }  
    }
}