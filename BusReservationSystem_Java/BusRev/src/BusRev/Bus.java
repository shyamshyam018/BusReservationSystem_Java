package src.BusRev;

public class Bus {
    private int busNo;
    private boolean ac;
    private int capacity;

    public Bus(int busNo, boolean ac, int capacity) {
        this.busNo = busNo;
        this.ac = ac;
        this.capacity = capacity;
    }

    // Getters
    public int getBusNo() {
        return busNo;
    }

    public boolean isAc() {
        return ac;
    }

    public int getCapacity() {
        return capacity;
    }

    // Setters
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void showBuses() {
        System.out.println("Bus Number: " + busNo + ", AC Available? " + ac + ", Capacity: " + capacity);
    }
}
