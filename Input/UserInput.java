package Input;
import java.util.Scanner;



public class UserInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\n1. Breakfast \n2.Lunch \n3.Dinner");
        System.out.print("\n Choose any.....");
        int choice = sc.nextInt();
}
}