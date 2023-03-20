package DevOps.Operations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Power {

    private static final Logger logger = LogManager.getLogger(Power.class);
    public static double power(double first_number, double second_number) {
        System.out.println("------------------------------ logs -----------------------------------------------------");
        logger.info("\t\t[POWER - " + first_number + " RAISED TO] " + second_number);
        double result = Math.pow(first_number,second_number);
        logger.info("\t\t[RESULT - POWER] - " + result);
        System.out.println("-----------------------------------------------------------------------------------------");
        return result;
    }
}
