package DevPlanModel;

import DevPlanModel.Knowledge.Knowledge;

public class Student {

    private String name;
    private Knowledge knowledge;
    private DevelopmentPlan devPlan;

    public Student(String name, Knowledge knowledge){
        this.name = name;
        this.knowledge = knowledge;
    }

    public void setDevPlan(DevelopmentPlan devPlan){
        this.devPlan=devPlan;
    }

    public DevelopmentPlan getDevPlan(){
        return this.devPlan;
    }

    public void setKnowledge(Knowledge knowledge) {
        this.knowledge = knowledge;
    }
}
