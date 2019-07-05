package DevPlanModel.Knowledge;

import DevPlanModel.Student;

public class University implements KnowledgeSource {

    private final int theoreticalKnowledge;
    private final int practicalKnowledge;

    public University(int theoreticalKnowledge, int practicalKnowledge){

        this.theoreticalKnowledge = theoreticalKnowledge;
        this.practicalKnowledge = practicalKnowledge;
    }

    @Override
    public void educate(Student student) {
//        student.setKnowledge(new Knowledge());
    }
}
