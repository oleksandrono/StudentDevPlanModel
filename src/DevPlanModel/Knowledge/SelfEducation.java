package DevPlanModel.Knowledge;

import DevPlanModel.Student;

public class SelfEducation implements KnowledgeSource {


    private final Knowledge knowledge;

    public SelfEducation(Knowledge knowledge){
        this.knowledge = knowledge;
    }

    @Override
    public void educate(Student student) {
        student.learn(knowledge);
    }
}