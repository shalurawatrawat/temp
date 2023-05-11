import java.util.Scanner;
class Week
{
    public static void main(String arr[])
    {
        Scanner ob = new Scanner(System.in);
        int a;
        System.out.println("enter a no");
        a=ob.nextInt();
        switch (a) 
        {
            case 1:
                System .out.println("sunday");
                break;
                case 2:
                System.out.println("monday");
                break;
                case 3:
                System .out.println("tuesday");
                break;
                case 4:
                System .out.println("Wednesday");
                break;
                case 5:
                System .out.println("Thursday");
                break;
                case 6:
                System .out.println(" Friday");
                break;
                case 7:
                System .out.println(" Saturday");
                break;
            default:
                break;
        }
    }
}