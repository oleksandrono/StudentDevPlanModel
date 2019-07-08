package DevPlanModel.Schedule;

import java.time.LocalDate;

public class Workdays implements Schedule {

    @Override
    public boolean isActive(LocalDate date) {
        return !(date.getDayOfWeek().getValue() == 6 || date.getDayOfWeek().getValue() == 7);
    }
}