package DevPlanModel.Schedule;

import java.time.LocalDate;
import java.time.temporal.WeekFields;
import java.util.Locale;

public class LastThursdayInMonths implements Schedule {


    @Override
    public boolean isActive(LocalDate date) {
        WeekFields weekFields = WeekFields.of(Locale.getDefault());
        int weekNumber = date.get(weekFields.weekOfMonth());
        return date.getDayOfWeek().getValue() == 4 && weekNumber == 4;
        //check last thursday in months for meetup
    }
}