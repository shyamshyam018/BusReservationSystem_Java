package src.BusRev;

import java.util.ArrayList;

public class BusSearch {
    public static ArrayList<Bus> searchBuses(ArrayList<Bus> buses, boolean ac, int minCapacity) {
        ArrayList<Bus> result = new ArrayList<>();
        for (Bus bus : buses) {
            if (bus.isAc() == ac && bus.getCapacity() >= minCapacity) {
                result.add(bus);
            }
        }
        return result;
    }
}
