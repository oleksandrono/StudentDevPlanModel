package DevPlanModel.Knowledge;

import DevPlanModel.Student;

import java.util.ArrayList;
import java.util.List;

public class Institution implements KnowledgeSource {

    private InstitutionType institutionType;
    private final Knowledge knowledge;
    private List<Student> students;

    public Institution(InstitutionType institutionType, Knowledge knowledge){
        this.institutionType = institutionType;
        this.knowledge = knowledge;
        this.students = new ArrayList<>();
    }

    public void enroll(Student student){
        students.add(student);
    }


    //______________________ not implemented
    @Override
    public void educate(Student student) {
        if(institutionType == InstitutionType.University){
            student.addKnowledge(knowledge);
        }
        else if(institutionType == InstitutionType.Internship){
            student.addKnowledge(knowledge);
        }
    }
}