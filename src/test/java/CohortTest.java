import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CohortTest {
    Student fer;
    Student trant;
    Cohort europa;
    Cohort deimos;
    Cohort ceres;
    @Before
    public void init(){
        ceres = new Cohort();
        europa = new Cohort();
        deimos = new Cohort();
        fer = new Student(1L, "Fer");
        fer.addGrade(100);

        trant = new Student(2L , "Trant");
        trant.addGrade(50);
        trant.addGrade(60);
        trant.addGrade(70);
    }
    @Test
    public void testToAddStudentToStudentList(){
        assertEquals(0, ceres.getStudents().size());
        assertEquals(1, deimos.getStudents().size());
//        assertEquals(1,deimos.getStudents().get(0).getId());


//        Student zack = new Student(3L, "Zackry");
//        assertNotNull(Cohort.getStudents());
    }

//    @Test
//    public void testToGetCurrentListOfStudents(){
//
//    }
//
    @Test
    public void testToGetAverageAndSeeIfCorrect(){
        assertEquals(80, europa.getCohortAverage(),0);
    }
}
