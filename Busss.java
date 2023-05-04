import java.util.Scanner;

interface BusBooking {
void bookTicket();
}

class Bus implements BusBooking {
    String[] busChoices;

    public Bus(String[] busChoices) 
    {
    this.busChoices = busChoices;
    }

    public void bookTicket() {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter your name: ");
    String name = sc.nextLine();

System.out.print("Enter the source: ");
String source = sc.nextLine();

System.out.print("Enter the destination: ");
String destination = sc.nextLine();

System.out.print("Enter the date of travel (dd/mm/yyyy): ");
String date = sc.nextLine();

System.out.println("Choose a bus:");
for (int i = 0; i < busChoices.length; i++) {
System.out.println((i+1) + ". " + busChoices[i]);
}

int choice = -1;
boolean validChoice = false;

while (!validChoice) {
System.out.print("Enter bus choice (1-" + busChoices.length + "): ");
try {
choice = Integer.parseInt(sc.nextLine());
if (choice > 0 && choice <= busChoices.length) {
validChoice = true;
} else {
System.out.println("Invalid choice. Please choose again.");
}
} catch (NumberFormatException e) {
System.out.println("Invalid. Please choose again.");
}
}

System.out.println("\nBooking Done.");
System.out.println("\n Here are the details:");
System.out.println("Name: " + name);
System.out.println("Source: " + source);
System.out.println("Destination: " + destination);
System.out.println("Date of Travel: " + date);
System.out.println("Bus Choice: " + busChoices[choice-1]);
}
}

public class Busss {
public static void main(String[] args) {
String[] busChoices = {"Bus 1", "Bus 2", "Bus 3"};
Bus bus = new Bus(busChoices);
bus.bookTicket();
}
}
