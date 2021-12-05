package commandHandlers;

import bookings.*; 

public class CmdListReservations implements Command{
    private BookingOffice bo;
    @Override
    public void execute(String[] cmdParts) {
        bo = BookingOffice.getInstance();
        bo.listReservations();
    }
}
