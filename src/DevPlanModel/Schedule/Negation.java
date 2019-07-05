package DevPlanModel.Schedule;

import java.time.LocalDate;

public class Negation implements Schedule {



    @Override
    public boolean isActive(LocalDate date) {
        return false;
    }
}
