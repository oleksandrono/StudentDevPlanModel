package DevPlanModel;

import DevPlanModel.Knowledge.KnowledgeSource;
import DevPlanModel.Schedule.Schedule;

import java.time.LocalDate;
import java.util.ArrayList;

public class Activity {
    private final KnowledgeSource knowledgeSource;
    private ArrayList<Schedule> schedules;

    public Activity(KnowledgeSource knowledgeSource, ArrayList<Schedule> schedules){
        this.knowledgeSource = knowledgeSource;
        this.schedules = schedules;
    }



    void tryToApply(Student student, LocalDate date){
        if(dateIsActive(date)){
            knowledgeSource.educate(student);
        }
    }

    private boolean dateIsActive(LocalDate date) {
        for (Schedule schedule : schedules ) {
            if(!schedule.isActive(date)){
                return false;
            }
        }
        return true;
    }
}