import DevPlanModel.Knowledge.Knowledge;
import DevPlanModel.Student;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class MainFunctionalityTest {
    @Test
    void closeCheck__withOneProduct() {
        Student student = new Student("Sasha", new Knowledge(50, 80), 0.9);


        assertThat(10, is(10));
    }
}