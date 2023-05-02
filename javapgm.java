import java.util.Scanner;

public class javapgm
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("\n1. Breakfast \n2.Lunch \n3.Dinner");
        System.out.print("\n Choose any.....");
        int choice = sc.nextInt();
        switch(choice) {
            case 1:
                System.out.print("\nEnter the time");
                int time = sc.nextInt();
                if(time>9&&time<12)
                    System.out.print("\nHave cereals");
                else if(time>12&&time<3)
                    System.out.print("\nHave sandwich");
                else
                    System.out.print("\nHave anything you want");
                    
                
              break;
            case 2:
                int i = 0;
                while (i < 5) 
                {
                    System.out.print("\nHave sandwich");
                    i++;
                }
                // {
                //     for(int k=1;i<n;i++)
                //     {
                //     System.out.print("\nHave sandwich");
                //     break;
                //     }
                // }
              break;
            case 3:
            String dinner;
            System.out.print("\nEnter the time");
            int timee = sc.nextInt();
            dinner = (timee<6) ? "chapathi" : "coffee";
            System.out.print(dinner);
            
                break;
            default:
              // code block
              System.out.print("\nDonot eat anything");
          }

        // System.out.println("Hello");

    }
  
}