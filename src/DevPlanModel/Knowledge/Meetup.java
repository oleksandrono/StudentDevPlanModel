package DevPlanModel.Knowledge;

import DevPlanModel.Student;

public class Meetup implements KnowledgeSource {


    private String name;
    private Knowledge knowledge;

    public Meetup(String name, Knowledge knowledge){

        this.name = name;
        this.knowledge = knowledge;
    }

    @Override
    public void educate(Student student) {
        student.addKnowledge(knowledge);
    }
}