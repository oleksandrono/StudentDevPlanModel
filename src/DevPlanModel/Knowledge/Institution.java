package DevPlanModel.Knowledge;

import DevPlanModel.Student;

import java.util.ArrayList;
import java.util.List;

public class Institution implements KnowledgeSource {


    private String name;
    private final Knowledge knowledge;
    private List<Student> students;

    public Institution(String name, Knowledge knowledge) {
        this.name = name;
        this.knowledge = knowledge;
        this.students = new ArrayList<>();
    }

    public void enroll(Student student) {
        students.add(student);
    }


    @Override
    public void educate(Student student) {
        if (students.contains(student)) {
            student.learn(knowledge);
        }
    }
}