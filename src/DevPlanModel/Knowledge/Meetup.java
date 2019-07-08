package DevPlanModel.Knowledge;

import DevPlanModel.Student;

public class Meetup implements KnowledgeSource {

    private Knowledge knowledge;

    public Meetup(Knowledge knowledge){
        this.knowledge = knowledge;
    }

    @Override
    public void educate(Student student) {
        student.addKnowledge(knowledge);
    }
}