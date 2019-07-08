package DevPlanModel.Knowledge;

import DevPlanModel.Student;

public class SelfEducation implements KnowledgeSource {


    private final String name;
    private final Knowledge knowledge;

    public SelfEducation(String name, Knowledge knowledge){
        this.name = name;
        this.knowledge = knowledge;
    }

    @Override
    public void educate(Student student) {
        student.addKnowledge(knowledge);
    }
}