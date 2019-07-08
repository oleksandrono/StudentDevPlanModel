package DevPlanModel;

import DevPlanModel.Knowledge.KnowledgeSource;
import DevPlanModel.Schedule.Schedule;

import java.time.LocalDate;

public class Activity {
    private final KnowledgeSource knowledgeSource;
    private final Schedule schedule;

    public Activity(KnowledgeSource knowledgeSource, Schedule schedule){
        this.knowledgeSource = knowledgeSource;
        this.schedule = schedule;
    }


    void tryToApply(Student student, LocalDate date){
        if(schedule.isActive(date)){
            knowledgeSource.educate(student);
        }
    }
}