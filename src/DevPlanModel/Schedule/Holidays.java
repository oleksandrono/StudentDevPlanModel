package DevPlanModel.Schedule;

import java.time.LocalDate;


public class Holidays implements Schedule {

    private LocalDate holidaysStart;
    private LocalDate holidaysEnd;

    public Holidays(LocalDate holidaysStart, LocalDate holidaysEnd){
        this.holidaysStart = holidaysStart;
        this.holidaysEnd = holidaysEnd;
    }

    @Override
    public boolean isActive(LocalDate date) {
        return !date.isBefore(holidaysEnd) || !date.isAfter(holidaysStart);

    }
}
