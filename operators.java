import java.util.Scanner;
public class operators
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter two numbers:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        if(n1%2==0)
        {
            System.out.print( n1+"  is Even");
        }
        else
        {
            if(n1<=n2)
            {
                System.out.println("Addition");
                System.out.println(n1+n2);
                System.out.println("Subtraction");
                System.out.println(n2-n1);
            }
        }

    }
}