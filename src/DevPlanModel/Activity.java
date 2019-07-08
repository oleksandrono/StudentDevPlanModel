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

    private void connectSchedules(){
        schedules.forEach(schedule -> {

        });
    }


    void tryToApply(Student student, LocalDate date){
        connectSchedules();
        schedules.forEach(
                schedule -> {
                    if(schedule.isActive(date)){
                        knowledgeSource.educate(student);
                    }
                }
        );
    }
}