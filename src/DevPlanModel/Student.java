package DevPlanModel;

import DevPlanModel.Knowledge.Knowledge;
import DevPlanModel.Schedule.Schedule;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private Knowledge knowledge;
    private double learningRatio;
    private Schedule schedule;
    private List<Schedule> schedules = new ArrayList<>();
    private DevelopmentPlan devPlan;

    public Student(String name, Knowledge knowledge, double learningRatio){
        this.name = name;
        this.knowledge = knowledge;
        this.learningRatio = learningRatio;
    }



    public void addSchedule(Schedule schedule){
        schedules.add(schedule);
    }

    public List<Schedule> getSchedules(){
        return schedules;
    }

    public void addDevPlan(DevelopmentPlan devPlan){
        this.devPlan=devPlan;
    }

    public void useDevPlan(){
        //some check
        // addKnowledge();
    }


    public Knowledge getKnowledge(){
        return this.knowledge;
    }

    public void addKnowledge(Knowledge knowledge){
        this.knowledge.practicalKnowledge += knowledge.practicalKnowledge;
        this.knowledge.theoreticalKnowledge += knowledge.theoreticalKnowledge;
    }
}