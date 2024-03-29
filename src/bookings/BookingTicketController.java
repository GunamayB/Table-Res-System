package bookings;

import java.util.HashMap;
import dateHandlers.*;

public class BookingTicketController {
    private static HashMap<Day, Integer> tControllers = new HashMap<>();
    public static int takeTicket(Day d) {
        Integer ticket = tControllers.get(d);
        if (ticket == null) {
            tControllers.put(d.clone(),2);
            return 1;
        } else {
            tControllers.put(d, ticket + 1);
            return ticket;
        }
    }
    public static void undoTakeTicket(Day d) {
        Integer ticket = tControllers.get(d);
        if (ticket != null) {
            if (ticket == 2){
                tControllers.remove(d);
            } else {
                tControllers.put(d, ticket - 1);
            }
        }
    }
}