package DevPlanModel.Schedule;

import java.time.LocalDate;

public class ExcludeSchedule implements Schedule {
    private Schedule schedule;

    public ExcludeSchedule(Schedule schedule){
        this.schedule = schedule;
    }
    @Override
    public boolean isActive(LocalDate date) {
        return !schedule.isActive(date);
    }
}
