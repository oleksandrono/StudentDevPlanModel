package DevPlanModel.Knowledge;

import DevPlanModel.Student;

public class Meetup implements KnowledgeSource {

    private final int theoreticalKnowledge;
    private final int practicalKnowledge;

    public Meetup(int theoreticalKnowledge, int practicalKnowledge){


        this.theoreticalKnowledge = theoreticalKnowledge;
        this.practicalKnowledge = practicalKnowledge;
    }

    @Override
    public void educate(Student student) {

    }
}
