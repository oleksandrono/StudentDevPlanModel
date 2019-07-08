import DevPlanModel.Activity;
import DevPlanModel.DevelopmentPlan;
import DevPlanModel.Knowledge.*;
import DevPlanModel.Schedule.LastThursdayInMonths;
import DevPlanModel.Schedule.Period;
import DevPlanModel.Schedule.Weekend;
import DevPlanModel.Student;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student("Sasha", (new Knowledge(50, 80)), 0.8);
        Student student2 = new Student("Vasya", (new Knowledge(40, 60)), 0.5);
        Student student3 = new Student("Petya", (new Knowledge(60, 90)), 0.9);
        Student student4 = new Student("Vanya", (new Knowledge(30, 80)), 0.7);


//        Schedule schedule1 = new Weekend();
//        Schedule schedule2 = new Period((LocalDate.of(2015, 9, 1)), (LocalDate.of(2020, 6, 30)));
//        Schedule schedule3 = new LastThursdayInMonths();
//        Schedule schedule4 = new Negation();

        //student 1 - pacifist
        DevelopmentPlan devPlan1 = new DevelopmentPlan(student1);
        Activity activity1_1 = new Activity((new Institution(InstitutionType.University, "CHSBC", (new Knowledge(20, 50)))), (new Period(LocalDate.of(2015, 9, 1), LocalDate.of(2019, 6, 30))));
        Activity activity1_2 = new Activity((new Institution(InstitutionType.University, "CHNU", (new Knowledge(30, 70)))), (new Period(LocalDate.of(2019, 9, 1), LocalDate.of(2021, 6, 30))));
        devPlan1.addActivity(activity1_1);
        devPlan1.addActivity(activity1_2);
        devPlan1.perform(student1);

        System.out.println("Pacifist, practical knowledge - " + student1.getKnowledge().practicalKnowledge);
        System.out.println("Pacifist, theoretical knowledge - " + student1.getKnowledge().theoreticalKnowledge);

        //student 2 - self education
        DevelopmentPlan devPlan2 = new DevelopmentPlan(student2);
        Activity activity2_1 = new Activity((new Meetup("<Meetup name>", new Knowledge(0, 20))), (new LastThursdayInMonths()));
        Activity activity2_2 = new Activity((new SelfEducation("Name", new Knowledge(20, 20))), (new Weekend()));
        Activity activity2_3 = new Activity(new Institution(InstitutionType.Internship, "InCamp", new Knowledge(80, 20)), new Period(LocalDate.of(2019, 7, 1), LocalDate.of(2019, 10, 1)));

        devPlan2.addActivity(activity2_1);
        devPlan2.addActivity(activity2_2);
        devPlan2.addActivity(activity2_3);
        devPlan2.perform(student2);

        System.out.println("Self education, practical knowledge - " + student2.getKnowledge().practicalKnowledge);
        System.out.println("Self education, theoretical knowledge - " + student2.getKnowledge().theoreticalKnowledge);


        //student 3 - "Teach me completely"

        DevelopmentPlan devPlan3 = new DevelopmentPlan(student3);
        Activity activity3_1 = new Activity(new Institution(InstitutionType.University, "CHNU", new Knowledge(20, 50)), new Period(LocalDate.of(2015, 9, 1), LocalDate.of(2019, 6, 30)));
        Activity activity3_2 = new Activity(new Meetup("<Meetup name>", new Knowledge(0, 20)), new LastThursdayInMonths());

        devPlan3.addActivity(activity3_1);
        devPlan3.addActivity(activity3_2);

        devPlan3.perform(student3);

        System.out.println("\"Teach me completely\", practical knowledge - " + student3.getKnowledge().practicalKnowledge);
        System.out.println("\"Teach me completely\", theoretical knowledge - " + student3.getKnowledge().theoreticalKnowledge);


        //student 4 - Conscious student

        DevelopmentPlan devPlan4 = new DevelopmentPlan(student4);
        Activity activity4_1 = new Activity(new Institution(InstitutionType.University, "CHSBC", new Knowledge(20, 50)), new Period(LocalDate.of(2016, 9, 1), LocalDate.of(2020, 6, 30)));
        Activity activity4_2 = new Activity(new Meetup("<Meetup name>", new Knowledge(0, 20)), new LastThursdayInMonths());
        Activity activity4_3 = new Activity((new SelfEducation("Name", new Knowledge(20, 20))), (new Weekend()));
        //Activity activity4_4 = new Activity(); ____STUDENT TEACH STUDENT
        Activity activity4_5 = new Activity(new Institution(InstitutionType.Internship, "InCamp", new Knowledge(80, 20)), new Period(LocalDate.of(2019, 7, 1), LocalDate.of(2019, 10, 1)));

        devPlan4.addActivity(activity4_1);
        devPlan4.addActivity(activity4_2);
        devPlan4.addActivity(activity4_3);
        devPlan4.addActivity(activity4_5);
        devPlan4.perform(student4);

        System.out.println("Conscious student, practical knowledge - " + student4.getKnowledge().practicalKnowledge);
        System.out.println("Conscious student, theoretical knowledge - " + student4.getKnowledge().theoreticalKnowledge);

    }
}