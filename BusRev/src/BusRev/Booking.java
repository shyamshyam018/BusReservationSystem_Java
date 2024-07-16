package src.BusRev;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Booking {
    String PassengerName;
    int BusNum;
    Date date;
    Booking(){
        Scanner scanner =  new Scanner(System.in);
        PassengerName = scanner.next();
        BusNum = scanner.nextInt();
        String stringdate = scanner.next();
        SimpleDateFormat objdate = new SimpleDateFormat("dd-MM;yyyy");
        try {
            date = objdate.parse(stringdate);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
