package DevOps.Operations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Factorial {

    private static final Logger logger = LogManager.getLogger(Factorial.class);

    public static double factorial(double num) {
        System.out.println("------------------------------ logs -----------------------------------------------------");
        logger.info("\t[FACTORIAL] - " + num);
        double result = fact(num);
        logger.info("\t[RESULT - FACTORIAL] - " + result);
        System.out.println("-----------------------------------------------------------------------------------------");

        return result;
    }
    public static double fact(double num) {
        double facto = 1;
        for(int i = 1; i <= num; ++i)
        { facto *= i;   }
        return  facto;
    }
}
