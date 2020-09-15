package stub;

import java.util.Arrays;
import java.util.List;

public class StubsGradeSystem extends GradeSystem{

    public List<Double> gradesFor(long studentId) {
        return Arrays.asList(75.0, 95.0, 100.0);
    }
}
