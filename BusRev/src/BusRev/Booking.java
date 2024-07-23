package src.BusRev;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Booking {
    int busNo;
    Date date;
    int numPassengers;

    Booking(Scanner scanner) {
        System.out.print("Enter Bus Number: ");
        busNo = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Enter Date (dd-MM-yyyy): ");
        String dateStr = scanner.nextLine();
        System.out.print("Enter Number of Passengers: ");
        numPassengers = scanner.nextInt();
        scanner.nextLine(); // consume newline

        SimpleDateFormat objDate = new SimpleDateFormat("dd-MM-yyyy");
        try {
            date = objDate.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> buses) {
        int capacity = 0;
        for (Bus bus : buses) {
            if (bus.getBusNo() == busNo) {
                capacity = bus.getCapacity();
                break;
            }
        }

        int bookedSeats = 0;
        for (Booking booking : bookings) {
            if (booking.busNo == busNo && booking.date.equals(date)) {
                bookedSeats += booking.numPassengers;
            }
        }

        return (capacity - bookedSeats) >= numPassengers;
    }
}
