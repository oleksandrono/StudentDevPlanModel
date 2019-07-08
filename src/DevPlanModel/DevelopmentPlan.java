package DevPlanModel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DevelopmentPlan {

    public List<Activity> activities;
    private Student student;

    public DevelopmentPlan(Student student){
        this.student = student;
        this.activities = new ArrayList<>();
    }
    public void addActivity(Activity activity){
        activities.add(activity);
    }

    void removeActivity(Activity activity){
        activities.remove(activity);
    }

    public void perform(Student student) {
        for(Activity activity : activities){
            activity.tryToApply(student, LocalDate.now());
        }
    }
}