package DevPlanModel.Schedule;

import java.time.LocalDate;

public class CompositeSchedule implements Schedule {

    private Schedule schedule1;
    private Schedule schedule2;

    public CompositeSchedule(Schedule schedule1, Schedule schedule2){
        this.schedule1 = schedule1;
        this.schedule2 = schedule2;
    }


    @Override
    public boolean isActive(LocalDate date) {
        return schedule1.isActive(date) && schedule2.isActive(date);
    }
}
