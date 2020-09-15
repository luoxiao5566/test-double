package mockito;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import stub.GradeService;
import stub.GradeSystem;
import stub.StubsGradeSystem;

import java.util.Arrays;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MockitoGradeServiceTest {

    @Test
    public void shouldReturn90WhenCalculateStudentAverageGradeAndGradeIs75And95And100() {
        GradeSystem gradeSystem = mock(GradeSystem.class);
        when(gradeSystem.gradesFor(111)).thenReturn(Arrays.asList(75.0, 95.0, 100.0));

        GradeService gradeService = new GradeService(gradeSystem);

        double result = gradeService.calculateAverageGrades(111);

        assertEquals(90,result);
    }


}
