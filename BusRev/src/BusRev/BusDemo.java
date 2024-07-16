package src.BusRev;
import java.util.Scanner;

public class BusDemo {
   public static void main(String[] args) {
    int userOpt = 1;
    Scanner scanner = new Scanner(System.in);
    while(userOpt==1){
        System.out.print("ENTER 1 TO BOOK OR 2 TO EXIT : ");
        userOpt = scanner.nextInt();
        if(userOpt==1){
            System.out.println("Booking...");
        }
    }
   }
}
