package DevPlanModel.Schedule;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Workdays implements Schedule {

    private static final List<DayOfWeek> WEEKEND = Arrays.asList(DayOfWeek.SATURDAY, DayOfWeek.SUNDAY);

    @Override
    public boolean isActive(LocalDate date) {
        return !WEEKEND.contains(date.getDayOfWeek());
    }
}