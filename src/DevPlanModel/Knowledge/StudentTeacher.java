package DevPlanModel.Knowledge;

import DevPlanModel.Student;

public class StudentTeacher implements KnowledgeSource {


    private Student student;
    private Knowledge knowledge;

    public StudentTeacher(Student student, Knowledge knowledge) {
        this.student = student;
        this.knowledge = knowledge;
    }

    @Override
    public void educate(Student student) {
        if ((this.student.getKnowledge().practicalKnowledge < student.getKnowledge().practicalKnowledge) || (this.student.getKnowledge().theoreticalKnowledge < student.getKnowledge().theoreticalKnowledge)) {
            student.learn(new Knowledge(0, 0));
        } else {
            student.learn(knowledge);
        }
    }
}
