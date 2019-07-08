package DevPlanModel.Schedule;

import java.time.LocalDate;

public class Period implements Schedule {


    private LocalDate firstDay;
    private LocalDate lastDay;

    public Period(LocalDate firstDay, LocalDate lastDay) {
        this.firstDay = firstDay;
        this.lastDay = lastDay;
    }

    @Override
    public boolean isActive(LocalDate date) {
        return !(date.isBefore(firstDay) || date.isAfter(lastDay)) || date.isAfter(lastDay);
    }
}