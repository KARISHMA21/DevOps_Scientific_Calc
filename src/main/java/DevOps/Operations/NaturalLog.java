package DevOps.Operations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class NaturalLog {

    private static final Logger logger = LogManager.getLogger(NaturalLog.class);

    public static double naturalLog(double num) {
        System.out.println("------------------------------ logs -----------------------------------------------------");
        logger.info("[NATURAL LOG] - " + num);
        double result = 0;
        try {

            if (num <0 ) {
                result = Double.NaN;
                throw new ArithmeticException("Case of NaN 0.0/0.0");
            }
            else {
                result = Math.log(num);
            }
        } catch (ArithmeticException error) {
            System.out.println("[EXCEPTION - LOG] - Cannot find log of negative numbers " + error.getLocalizedMessage());
        }
        logger.info("[RESULT - NATURAL LOG] - " + result);
        System.out.println("-----------------------------------------------------------------------------------------");
        return result;
    }
}
