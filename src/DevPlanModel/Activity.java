package DevPlanModel;

import DevPlanModel.Knowledge.KnowledgeSource;
import DevPlanModel.Schedule.Period;
import DevPlanModel.Schedule.Schedule;

import java.time.LocalDate;

public class Activity {
    private final KnowledgeSource knowledgeSource;
    private final Schedule schedule;
    private Period period = new Period(1, 10);

    public Activity(KnowledgeSource knowledgeSource, Schedule schedule){
        this.knowledgeSource = knowledgeSource;
        this.schedule = schedule;
    }

    public void tryToApply(Student student, LocalDate date){
        if(period.isActive(date)){
            knowledgeSource.educate(student);
        }
    }
}
