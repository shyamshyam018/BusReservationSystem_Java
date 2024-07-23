package src.BusRev;

import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Booking {
    String PassengerName;
    int BusNum;
    Date date;

    public Booking(Scanner scanner) {
        System.out.print("Enter Passenger Name: ");
        PassengerName = scanner.next();
        System.out.print("Enter Bus Number: ");
        BusNum = scanner.nextInt();
        System.out.print("Enter Date (dd-MM-yyyy): ");
        String stringdate = scanner.next();
        SimpleDateFormat objdate = new SimpleDateFormat("dd-MM-yyyy");
        try {
            date = objdate.parse(stringdate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> buses) {
        int capacity = 0;
        for (Bus b : buses) {
            if (b.FindBusNo() == BusNum) {
                capacity = b.FindCapacity();
            }
        }
        int booked = 0;
        for (Booking bo : bookings) {
            if (bo.BusNum == BusNum && bo.date.equals(date)) {
                booked++;
            }
        }
        return booked < capacity;
    }
}
