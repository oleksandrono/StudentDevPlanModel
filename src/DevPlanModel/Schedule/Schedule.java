package DevPlanModel.Schedule;

import java.time.LocalDate;



public interface Schedule {
    // default for exclude schedule
    boolean isActive(LocalDate date);

    default Schedule exclude(){
        return new ExcludeSchedule(this);
    }
}
