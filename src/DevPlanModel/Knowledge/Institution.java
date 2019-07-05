package DevPlanModel.Knowledge;

import DevPlanModel.Student;

import java.util.ArrayList;
import java.util.List;

public class Institution implements KnowledgeSource {

    private InstitutionType institutionType;
    private List<Student> students;

    public Institution(InstitutionType institutionType){
        this.institutionType = institutionType;
        this.students = new ArrayList<>();
    }

    public void enroll(Student student){
        students.add(student);
    }

    @Override
    public void educate(Student student) {
        if(institutionType == InstitutionType.University){

        }
        else if(institutionType == InstitutionType.Internship){

        }
    }
}
