package DevPlanModel.Schedule;

import java.time.LocalDate;

public class LastThursdayInMonths implements Schedule {



    @Override
    public boolean isActive(LocalDate date) {
        return false;
    }
}
