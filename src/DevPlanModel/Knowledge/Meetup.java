package DevPlanModel.Knowledge;

import DevPlanModel.Student;

public class Meetup implements KnowledgeSource {

    private Knowledge knowledge;
    private boolean practicalMeetup;

    public Meetup(Knowledge knowledge, boolean PracticalMeetup) {
        this.knowledge = knowledge;
        practicalMeetup = PracticalMeetup;
    }

    @Override
    public void educate(Student student) {
        if (practicalMeetup) {
            if (student.hasLaptop()) {
                student.learn(new Knowledge(knowledge.practicalKnowledge, knowledge.theoreticalKnowledge));
            } else {
                student.learn(new Knowledge(0, knowledge.theoreticalKnowledge));
            }
        } else {
            student.learn(knowledge);
        }
    }
}