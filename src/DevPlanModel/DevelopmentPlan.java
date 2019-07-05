package DevPlanModel;

import DevPlanModel.Schedule.Period;

import java.util.ArrayList;
import java.util.List;

public class DevelopmentPlan {

    public List<Activity> activities;
    private Student student;

    public DevelopmentPlan(Student student){
        this.student = student;
        this.activities = new ArrayList<>();
    }
    void addActivity(Activity activity){
        activities.add(activity);
    }

    void removeActivity(Activity activity){
        activities.remove(activity);
    }

    void perform(Student student, Period period) {

    }
}
