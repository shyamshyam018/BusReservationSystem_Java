package src.BusRev;

import java.util.ArrayList;
import java.util.Scanner;

public class BusDemo {

    public static void main(String[] args) {
        ArrayList<Bus> buses = new ArrayList<>();
        ArrayList<Booking> bookings = new ArrayList<>();

        buses.add(new Bus(1, true, 5));
        buses.add(new Bus(2, false, 5));
        buses.add(new Bus(3, true, 2));

        displayHeader();
        for (Bus b : buses) {
            b.showBuses();
        }

        Scanner scanner = new Scanner(System.in);
        int userOpt = 0;
        while (userOpt != 3) {
            displayMainMenu();
            userOpt = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (userOpt) {
                case 1:
                    searchAndFilterBuses(buses, scanner);
                    break;
                case 2:
                    Booking booking = new Booking(scanner);
                    if (booking.isAvailable(bookings, buses)) {
                        bookings.add(booking);
                        System.out.println("\nBooking Confirmed!");
                    } else {
                        System.out.println("\nNo Vacancy. Please choose another bus or date.");
                    }
                    break;
                case 3:
                    System.out.println("\nThank you for using our service. Exiting...");
                    break;
                default:
                    System.out.println("\nInvalid option. Please try again.");
            }
        }
        scanner.close();
    }

    private static void displayHeader() {
        System.out.println();
        printLine(50, '=');
        System.out.println("|" + formatCentered("Welcome to Bus Reservation System", 48) + "|");
        printLine(50, '=');
        System.out.println();
    }

    private static void displayMainMenu() {
        printLine(50, '=');
        System.out.println("|" + formatCentered("Main Menu", 48) + "|");
        printLine(50, '=');
        System.out.println("| 1. Search and Filter Buses                     |");
        System.out.println("| 2. Book a Bus                                  |");
        System.out.println("| 3. Exit                                        |");
        printLine(50, '=');
        System.out.print("Enter your choice: ");
    }

    private static void searchAndFilterBuses(ArrayList<Bus> buses, Scanner scanner) {
        System.out.println();
        printLine(50, '-');
        System.out.println("|" + formatCentered("Search and Filter Buses", 48) + "|");
        printLine(50, '-');
        System.out.print("| Enter 1 for AC, 2 for Non-AC: ");
        int acChoice = scanner.nextInt();
        boolean ac = acChoice == 1;
        System.out.print("| Enter Minimum Capacity: ");
        int minCapacity = scanner.nextInt();
        printLine(50, '-');

        ArrayList<Bus> filteredBuses = BusSearch.searchBuses(buses, ac, minCapacity);
        if (filteredBuses.isEmpty()) {
            System.out.println("| No buses found matching your criteria.");
        } else {
            System.out.println("| Buses found:");
            for (Bus bus : filteredBuses) {
                System.out.println("| " + formatBusDetails(bus));
            }
        }
        printLine(50, '-');
    }

    private static void printLine(int length, char character) {
        for (int i = 0; i < length; i++) {
            System.out.print(character);
        }
        System.out.println();
    }

    private static String formatCentered(String text, int width) {
        int padding = (width - text.length()) / 2;
        return " ".repeat(padding) + text + " ".repeat(width - text.length() - padding);
    }

    private static String formatBusDetails(Bus bus) {
        return String.format("Bus Number: %d | AC: %b | Capacity: %d", bus.getBusNo(), bus.isAc(), bus.getCapacity());
    }
}
