package DevOps.Operations;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class SquareRoot {

    private static final Logger logger = LogManager.getLogger(SquareRoot.class);

    public static double sqroot(double num) {

        System.out.println("------------------------------ logs -----------------------------------------------------");
        logger.info("[SQ ROOT]");
        double result = Math.sqrt(num);
//        logger.info("[RESULT-SQ ROOT]-[" + result+"]");
        System.out.println("-----------------------------------------------------------------------------------------");

        return result;
    }
}
