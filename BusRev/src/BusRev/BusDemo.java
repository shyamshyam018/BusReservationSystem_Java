package src.BusRev;

import java.util.Scanner;
import java.util.ArrayList;

public class BusDemo {

    public static void main(String[] args) {
        ArrayList<Bus> buses = new ArrayList<>();
        ArrayList<Booking> bookings = new ArrayList<>();

        buses.add(new Bus(1, true, 2));
        buses.add(new Bus(2, false, 5));
        buses.add(new Bus(3, true, 2));

        for (Bus b : buses) {
            b.showBuses();
        }

        int userOpt = 1;
        Scanner scanner = new Scanner(System.in);
        while (userOpt == 1) {
            System.out.print("ENTER 1 TO BOOK OR 2 TO EXIT: ");
            userOpt = scanner.nextInt();
            if (userOpt == 1) {
                Booking booking = new Booking(scanner);
                if (booking.isAvailable(bookings, buses)) {
                    bookings.add(booking);
                    System.out.println("Your Booking has been Confirmed!");
                } else {
                    System.out.println("No Vacancy, Please Choose other Bus or Date!");
                }
            }
        }
        scanner.close();
    }
}
