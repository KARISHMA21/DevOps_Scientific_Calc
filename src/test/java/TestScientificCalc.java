import DevOps.*;

import static org.junit.Assert.*;

import DevOps.Operations.Factorial;
import DevOps.Operations.NaturalLog;
import DevOps.Operations.Power;
import DevOps.Operations.SquareRoot;
import org.junit.Test;

public class TestScientificCalc {
    private static final double DELTA = 1e-15;
//    ScientificCalc calculator = new ScientificCalc();

    @Test
    public void factorialTruePositive(){
        assertEquals("Finding factorial of a number for True Positive", 120, Factorial.factorial(5), DELTA);
        assertEquals("Finding factorial of a number for True Positive", 24, Factorial.factorial(4), DELTA);
    }

    @Test
    public void factorialFalsePositive(){
        assertNotEquals("Finding factorial of a number for False Positive", 120, Factorial.factorial(6), DELTA);
        assertNotEquals("Finding factorial of a number for False Positive", 24, Factorial.factorial(3), DELTA);
    }

    @Test
    public void powerTruePositive(){
        assertEquals("Finding power for True Positive", 8, Power.power(2, 3), DELTA);
        assertEquals("Finding power for True Positive", 64, Power.power(4, 3), DELTA);
    }

    @Test
    public void powerFalsePositive(){
        assertNotEquals("Finding power for False Positive", 6, Power.power(2, 2), DELTA);
        assertNotEquals("Finding power for False Positive", -7.3, Power.power(2, 3), DELTA);
    }

    @Test
    public void logTruePositive(){
        assertEquals("Finding natural log for True Positive", 0, NaturalLog.naturalLog(1), DELTA);
        assertEquals("Finding natural log for True Positive", 0, NaturalLog.naturalLog(1), DELTA);
    }

    @Test
    public void logFalsePositive(){
        assertNotEquals("Finding natural log for False Positive", 6, NaturalLog.naturalLog(2.4), DELTA);
        assertNotEquals("Finding natural log for False Positive", 7.3, NaturalLog.naturalLog(2.1), DELTA);
    }

    @Test
    public void sqrootTruePositive(){
        assertEquals("Finding square root for True Positive", 2, SquareRoot.sqroot(4), DELTA);
        assertEquals("Finding square root for True Positive", 1, SquareRoot.sqroot(1), DELTA);
    }

    @Test
    public void sqrootFalsePositive(){
        assertNotEquals("Finding square root for False Positive", 1, SquareRoot.sqroot(3), DELTA);
        assertNotEquals("Finding square root for False Positive", 0, SquareRoot.sqroot(4), DELTA);

    }


}