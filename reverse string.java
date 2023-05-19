import java.util.Scanner;
class Main
{
     public static void main(String arr[])
     {
        String st;
        Scanner ob = new Scanner(System.in);

        System.out.println("enter string");
        st=ob.nextLine();

        int len = st.length();

        for(int i=len-1; i>=0; i--)
        {
            System.out.println(st.charAt(i));
        }
    }
}