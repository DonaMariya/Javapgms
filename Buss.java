
import java.util.Scanner;
interface BusBooking {
    void getBookingDetails();
}


class Passenger {
    String name;
    String source;
    String destination;
    String dateOfBooking;


    public Passenger(String name, String source, String destination, String dateOfBooking) {
this.name = name;

        this.source = source;

        this.destination = destination;

        this.dateOfBooking = dateOfBooking;

    }


    public String toString() {

        return "Name: " + name + ", Source: " + source + ", Destination: " + destination + ", Date of Booking: " + dateOfBooking;

    }

}


class Bus implements BusBooking {

    String[] busChoices;


    public Bus(String[] busChoices) {

        this.busChoices = busChoices;

    }


    public void getBookingDetails() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name:");

        String name = sc.nextLine();

        System.out.println("Enter the source:");

        String source = sc.nextLine();

        System.out.println("Enter the destination:");

        String destination = sc.nextLine();

        System.out.println("Enter the date of booking (dd/mm/yyyy):");

        String dateOfBooking = sc.nextLine();

        System.out.println("Select a bus from the following choices:");

        for (int i = 0; i < busChoices.length; i++) {

            System.out.println((i+1) + ". " + busChoices[i]);

        }

        int choice = 0;

        boolean isValidChoice = false;

        while (!isValidChoice) {

            try {

                System.out.println("Enter your choice:");

                choice = Integer.parseInt(sc.nextLine());

                if (choice >= 1 && choice <= 3) {

                    isValidChoice = true;

                } else {

                    System.out.println("Invalid choice! Please enter a valid choice.");

                }

            } catch (NumberFormatException e) {

                System.out.println("Invalid choice! Please enter a valid choice.");

            }

        }


        Passenger passenger = new Passenger(name, source, destination, dateOfBooking);


        System.out.println("Booking done! Here are the details:");

        System.out.println(passenger.toString());

        System.out.println("Bus choice: " + busChoices[choice-1]);

    }

}


public class Buss {

    public static void main(String[] args) {

        String[] busChoices = {"Volvo", "Mercedes", "BMW"};

        Bus bus = new Bus(busChoices);

        bus.getBookingDetails();

    }

}






