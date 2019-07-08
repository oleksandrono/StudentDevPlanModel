package DevPlanModel;

import DevPlanModel.Knowledge.KnowledgeSource;
import DevPlanModel.Schedule.CompositeSchedule;
import DevPlanModel.Schedule.Schedule;

import java.time.LocalDate;
import java.util.ArrayList;

public class Activity {
    private final KnowledgeSource knowledgeSource;
    private ArrayList<Schedule> schedules;
    private Schedule schedule;

    public Activity(KnowledgeSource knowledgeSource, ArrayList<Schedule> schedules){
        this.knowledgeSource = knowledgeSource;
        this.schedules = schedules;

        this.schedule = schedules.get(0);
        for(int i = 1; i<schedules.size(); i++){
            this.schedule = new CompositeSchedule(this.schedule, schedules.get(i));
        }
    }



    void tryToApply(Student student, LocalDate date){
        if(schedule.isActive(date)){
            knowledgeSource.educate(student);
        }
    }

}