package tableHandler;

import java.util.HashMap;
import dateHandlers.*;

public class TableAssignContAccessor
{
    private static HashMap<Day, DailyTableAssignmentController> tControllers = new HashMap<>();

    public static DailyTableAssignmentController getDailyTableAssignmentController(Day d)
    {
        DailyTableAssignmentController dTACont = tControllers.get(d);
        if (dTACont == null) {
            dTACont = new DailyTableAssignmentController();
            tControllers.put( d, dTACont);
        }
        return dTACont;
    }
}

