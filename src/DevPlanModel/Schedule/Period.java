package DevPlanModel.Schedule;

import java.time.LocalDate;

public class Period implements Schedule {


    private final int firstDay;
    private final int lastDay;

    public Period(int firstDay, int lastDay) {

        this.firstDay = firstDay;
        this.lastDay = lastDay;
    }

    @Override
    public boolean isActive(LocalDate date) {
        return false;
    }
}
