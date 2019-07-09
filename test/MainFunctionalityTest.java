import DevPlanModel.Activity;
import DevPlanModel.DevelopmentPlan;
import DevPlanModel.Knowledge.*;
import DevPlanModel.Schedule.*;
import DevPlanModel.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


class MainFunctionalityTest {

    private static Student student;
    private static DevelopmentPlan devPlan;
    private static ArrayList<Schedule> schedulesInternship;
    private static ArrayList<Schedule> schedulesUniversity;
    private static ArrayList<Schedule> schedulesMeetup;
    private static ArrayList<Schedule> schedulesSelfEducation;
    private static ArrayList<Schedule> schedulesStudentTeacher;

    @BeforeEach
    void start_configuration() {
        student = new Student("Sasha", new Knowledge(0, 0), 0.8, true);
        devPlan = new DevelopmentPlan(student);
        schedulesInternship = new ArrayList<>();
        schedulesUniversity = new ArrayList<>();
        schedulesMeetup = new ArrayList<>();
        schedulesSelfEducation = new ArrayList<>();
        schedulesStudentTeacher = new ArrayList<>();

    }

    @Test
    void dumb_test() {
        Student student = new Student("Sasha", new Knowledge(50, 80), 0.9, false);

        assertThat(10, is(10));
    }

    @Test
    void learn__Internship__educateStudent() {
        schedulesInternship.add(new Period(LocalDate.of(2019, 7, 1), LocalDate.of(2019, 7, 30)));
        schedulesInternship.add(new Workdays());

        Institution internship = new Institution("Internship", new Knowledge(3, 1));
        Activity activity = new Activity(internship, schedulesInternship);
        internship.enroll(student);
        devPlan.addActivity(activity);
        devPlan.perform(student, LocalDate.of(2019, 6, 29), LocalDate.of(2019, 8, 1));

        assertThat(student.getKnowledge().practicalKnowledge, is(57));
        assertThat(student.getKnowledge().theoreticalKnowledge, is(19));
    }

    @Test
    void learn__University__educateStudent() {
        schedulesUniversity.add(new Period(LocalDate.of(2019, 6, 1), LocalDate.of(2019, 8, 30)));
        schedulesUniversity.add(new Workdays());
        schedulesUniversity.add(new Holidays(LocalDate.of(2019, 7, 1), LocalDate.of(2019, 7, 14)));
        schedulesUniversity.add(new Holidays(LocalDate.of(2019, 7, 14), LocalDate.of(2019, 7, 31)));

        Institution university = new Institution("University", new Knowledge(1, 2));
        Activity activity = new Activity(university, schedulesUniversity);
        university.enroll(student);

        devPlan.addActivity(activity);
        devPlan.perform(student, LocalDate.of(2019, 5, 31), LocalDate.of(2019, 9, 1));


        assertThat(student.getKnowledge().practicalKnowledge, is(35));
        assertThat(student.getKnowledge().theoreticalKnowledge, is(70));

    }

    @Test
    void learn__Meetup__educateStudent() {
        schedulesMeetup.add(new LastThursdayInMonths());
        Activity activity = new Activity(new Meetup(new Knowledge(10, 10), true), schedulesMeetup);
        devPlan.addActivity(activity);
        devPlan.perform(student, LocalDate.of(2019, 1, 1), LocalDate.of(2019, 12, 31));

        assertThat(student.getKnowledge().practicalKnowledge, is(96));
        assertThat(student.getKnowledge().theoreticalKnowledge, is(96));
    }

    @Test
    void learn__SelfEducation__educateStudent() {
        schedulesSelfEducation.add(new Weekend());
        Activity activity = new Activity(new SelfEducation(new Knowledge(5, 10)), schedulesSelfEducation);
        devPlan.addActivity(activity);
        devPlan.perform(student, LocalDate.of(2019, 1, 1), LocalDate.of(2019, 12, 31));

        assertThat(student.getKnowledge().practicalKnowledge, is(416));
        assertThat(student.getKnowledge().theoreticalKnowledge, is(832));


    }

    @Test
    void learn__StudentTeacher__educateStudent() {
        schedulesMeetup.add(new LastThursdayInMonths());
        Activity activity = new Activity(new Meetup(new Knowledge(10, 10), true), schedulesMeetup);
        devPlan.addActivity(activity);
        devPlan.perform(student, LocalDate.of(2019, 1, 1), LocalDate.of(2019, 12, 31));

        Student student2 = new Student("Sasha", new Knowledge(0, 0), 0.8, true);
        DevelopmentPlan devPlan2 = new DevelopmentPlan(student2);
        schedulesStudentTeacher.add(new Weekend());
        Activity activity2 = new Activity(new StudentTeacher(student, new Knowledge(5, 10)), schedulesStudentTeacher);
        devPlan2.addActivity(activity2);
        devPlan2.perform(student2, LocalDate.of(2019, 1, 1), LocalDate.of(2019, 12, 31));

        assertThat(student2.getKnowledge().practicalKnowledge, is(52));
        assertThat(student2.getKnowledge().theoreticalKnowledge, is(104));
    }
}