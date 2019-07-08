import DevPlanModel.Activity;
import DevPlanModel.DevelopmentPlan;
import DevPlanModel.Knowledge.*;
import DevPlanModel.Schedule.*;
import DevPlanModel.Student;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student("Sasha", (new Knowledge(0, 0)), 0.8);
        Student student2 = new Student("Vasya", (new Knowledge(0, 0)), 0.5);
        Student student3 = new Student("Petya", (new Knowledge(0, 0)), 0.9);
        Student student4 = new Student("Vanya", (new Knowledge(0, 0)), 0.7);


        ArrayList<Schedule> schedulesUniversity = new ArrayList<>();
        schedulesUniversity.add(new Period(LocalDate.of(2015, 9, 1), LocalDate.of(2020, 5, 30)));
        schedulesUniversity.add(new Workdays());
//        schedulesUniversity.add(new Holidays(LocalDate.of(2016, 6, 1), LocalDate.of(2016, 8, 30)));
//        schedulesUniversity.add(new Holidays(LocalDate.of(2017, 6, 1), LocalDate.of(2017, 8, 30)));
//        schedulesUniversity.add(new Holidays(LocalDate.of(2018, 6, 1), LocalDate.of(2018, 8, 30)));
//        schedulesUniversity.add(new Holidays(LocalDate.of(2019, 6, 1), LocalDate.of(2019, 8, 30)));

        ArrayList<Schedule> schedulesUniversity2 = new ArrayList<>();
        schedulesUniversity2.add(new Period(LocalDate.of(2020, 9, 1), LocalDate.of(2022, 5, 30)));
        schedulesUniversity2.add(new Workdays());
        schedulesUniversity2.add(new Holidays(LocalDate.of(2021, 6, 1), LocalDate.of(2021, 8, 30)));


        ArrayList<Schedule> schedulesMeetup = new ArrayList<>();
        schedulesMeetup.add(new LastThursdayInMonths());

        ArrayList<Schedule> schedulesSelfEducation = new ArrayList<>();
        schedulesSelfEducation.add(new Weekend());

        ArrayList<Schedule> schedulesInternship = new ArrayList<>();
        schedulesInternship.add(new Period(LocalDate.of(2019, 7, 1), LocalDate.of(2019, 10,1)));
        schedulesInternship.add(new Workdays());



        //student 1 - pacifist
        DevelopmentPlan devPlan1 = new DevelopmentPlan(student1);
        Activity activity1_1 = new Activity(new Institution(InstitutionType.University,  new Knowledge(1, 2)), schedulesUniversity);
        Activity activity1_2 = new Activity(new Institution(InstitutionType.University, new Knowledge(1, 2)), schedulesUniversity2);
        devPlan1.addActivity(activity1_1);
        devPlan1.addActivity(activity1_2);
        devPlan1.perform(student1, LocalDate.of(2015, 1, 1), LocalDate.of(2022, 12, 1));

        System.out.println("Pacifist, practical knowledge - " + student1.getKnowledge().practicalKnowledge);
        System.out.println("Pacifist, theoretical knowledge - " + student1.getKnowledge().theoreticalKnowledge);

        //student 2 - self education
        DevelopmentPlan devPlan2 = new DevelopmentPlan(student2);
        Activity activity2_1 = new Activity((new Meetup(new Knowledge(0, 2))), schedulesMeetup);
        Activity activity2_2 = new Activity(new SelfEducation(new Knowledge(2, 2)), schedulesSelfEducation);
        Activity activity2_3 = new Activity(new Institution(InstitutionType.Internship, new Knowledge(5, 2)), schedulesInternship);

        devPlan2.addActivity(activity2_1);
        devPlan2.addActivity(activity2_2);
        devPlan2.addActivity(activity2_3);
        devPlan2.perform(student2, LocalDate.of(2015, 1, 1), LocalDate.of(2020, 12, 1));

        System.out.println("Self education, practical knowledge - " + student2.getKnowledge().practicalKnowledge);
        System.out.println("Self education, theoretical knowledge - " + student2.getKnowledge().theoreticalKnowledge);


        //student 3 - "Teach me completely"

        DevelopmentPlan devPlan3 = new DevelopmentPlan(student3);
        Activity activity3_1 = new Activity(new Institution(InstitutionType.University, new Knowledge(2, 3)), schedulesUniversity);
        Activity activity3_2 = new Activity(new Meetup(new Knowledge(0, 2)), schedulesMeetup);

        devPlan3.addActivity(activity3_1);
        devPlan3.addActivity(activity3_2);

        devPlan3.perform(student3, LocalDate.of(2015, 1, 1), LocalDate.of(2020, 12, 1));

        System.out.println("\"Teach me completely\", practical knowledge - " + student3.getKnowledge().practicalKnowledge);
        System.out.println("\"Teach me completely\", theoretical knowledge - " + student3.getKnowledge().theoreticalKnowledge);


        //student 4 - Conscious student

        DevelopmentPlan devPlan4 = new DevelopmentPlan(student4);


        Activity activity4_1 = new Activity(new Institution(InstitutionType.University, new Knowledge(1, 2)), schedulesUniversity);
        Activity activity4_2 = new Activity(new Meetup(new Knowledge(0, 2)), schedulesMeetup);
        Activity activity4_3 = new Activity((new SelfEducation( new Knowledge(2, 2))), schedulesSelfEducation);
        //Activity activity4_4 = new Activity(); ____STUDENT TEACH STUDENT
        Activity activity4_5 = new Activity(new Institution(InstitutionType.Internship, new Knowledge(5, 2)), schedulesInternship);

        devPlan4.addActivity(activity4_1);
        devPlan4.addActivity(activity4_2);
        devPlan4.addActivity(activity4_3);
        devPlan4.addActivity(activity4_5);
        devPlan4.perform(student4, LocalDate.of(2015, 1, 1), LocalDate.of(2020, 12, 1));

        System.out.println("Conscious student, practical knowledge - " + student4.getKnowledge().practicalKnowledge);
        System.out.println("Conscious student, theoretical knowledge - " + student4.getKnowledge().theoreticalKnowledge);

    }
}