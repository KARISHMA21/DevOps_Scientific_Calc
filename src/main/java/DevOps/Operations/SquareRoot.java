package DevOps.Operations;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class SquareRoot {

    private static final Logger logger = LogManager.getLogger(SquareRoot.class);

    public static double sqroot(double num) {

        System.out.println("------------------------------ logs -----------------------------------------------------");
        logger.info("\t[SQ ROOT] - " + num);
        double result = Math.sqrt(num);
        logger.info("\t[RESULT - SQ ROOT] - " + result);
        System.out.println("-----------------------------------------------------------------------------------------");

        return result;
    }
}
