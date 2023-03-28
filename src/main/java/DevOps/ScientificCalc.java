package DevOps;

import java.util.InputMismatchException;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import static DevOps.Operations.Factorial.factorial;
import static DevOps.Operations.NaturalLog.naturalLog;
import static DevOps.Operations.SquareRoot.sqroot;
import static DevOps.Operations.Power.power;



public class ScientificCalc {

    private static final Logger logger = LogManager.getLogger(ScientificCalc.class);
    public ScientificCalc() {
    }
    public static void main(String[] args) {
//    public static void main(String[] args) {
        System.out.println("Hello SCIENTIFIC CALCULATOR!");

        ScientificCalc calculator = new ScientificCalc();
//        SquareRoot squareRoot = new SquareRoot();
        Scanner scanner = new Scanner(System.in);
        double first_number, second_number,result;
        do {
            System.out.println("============================================================================================");
            System.out.println("                           SCIENTIFIC CALCULATOR USING DEVOPS. ");
            System.out.println("============================================================================================");

            System.out.println("\n              Enter [1-5] to select one of the below operations --> \n");
            System.out.print("" +
                    "\t1. Square root                   - √x\n" +
                    "\t2. Factorial                     - x!\n" +
                    "\t3. Natural logarithm (base е)    - ln(x)\n" +
                    "\t4. Power                         - x^b\n" +
                    "\t5. Exit\n\n" +
                    "ENTER YOUR CHOICE HERE --> ");

            int choice;
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException error) {
                return;
            }

            switch (choice) {

                // ---------------------------------------------------- Square root  ----------------------------------------------------
                case 1:
                    // Square root
                    System.out.print("\nYou have selected Square root operation");
                    System.out.print("\nEnter a number to find it's Square root : ");
                    first_number = scanner.nextDouble();
                   if(first_number<0 || first_number>=Integer.MAX_VALUE)
                    {    System.out.print("\nSorry!! Invalid entry, Please try again\n\n");
                        System.out.println("------------------------------ logs -----------------------------------------------------");
                            logger.error("[SQ ROOT]-Invalid entry");
                        System.out.println("-----------------------------------------------------------------------------------------");

                    }
                   else
                    {
                        //SquareRoot squareRoot = new SquareRoot();
                        result = sqroot(first_number);
                        System.out.println("\nSQUARE ROOT OF " + first_number + " IS --> " + result);
                        System.out.println("\n");
                    }
                    break;

        // ---------------------------------------------------- Factorial -------------------------------------------------------
                case 2:
                    // Factorial
                    System.out.print("\nYou have selected Factorial operation");
                    System.out.print("\nEnter a number to find it's Factorial : ");
                    first_number = scanner.nextDouble();
                    if(first_number<0 || first_number!=(int)first_number ||first_number>=Integer.MAX_VALUE) {
                        System.out.print("\nSorry!! Invalid entry, Please try again\n\n");
                        System.out.println("------------------------------ logs -----------------------------------------------------");
                        logger.error("[FACTORIAL]-Invalid entry");
                        System.out.println("-----------------------------------------------------------------------------------------");
                    }
                    else
                  {
    //                   Factorial fact= new Factorial();
                        result=factorial(first_number);
                        System.out.println("\nFACTORIAL OF "+first_number+" IS --> " + result);
                        System.out.println("\n");
                  }
                    break;

        // ---------------------------------------------------- Natural Log -------------------------------------------------------
                case 3:
                    // Natural log
                    System.out.print("\nYou have selected Natural Log operation");
                    System.out.print("\nEnter a number to find it's Natural Log : ");
                    first_number = scanner.nextDouble();
                    if(first_number<=0 || first_number>=Integer.MAX_VALUE) {
                        System.out.print("\nSorry!! Invalid entry, Please try again\n\n");
                        System.out.println("------------------------------ logs -----------------------------------------------------");
                        logger.error("[NATURAL LOG]-Invalid entry");
                        System.out.println("-----------------------------------------------------------------------------------------");
                    }

                    else {
                        result = naturalLog(first_number);
                        System.out.println("\nNATURAL LOG OF " + first_number + " IS --> " + result);
                        System.out.println("\n");
                    }
                    break;

        // ----------------------------------------------------- Power -------------------------------------------------------------
                case 4:
                    // Power
                    System.out.print("\nYou have selected Power operation");
                    System.out.print("\nEnter first number to find it's Power : ");

                    first_number = scanner.nextDouble();
                    System.out.print("\nEnter the power to which "+first_number+" should be found : ");
                    second_number = scanner.nextDouble();

                    if(first_number==0.0 && second_number ==0.0)
                    {
                        System.out.print("\nSorry!! Invalid entry, Please try again\n\n");
                        System.out.println("------------------------------ logs -----------------------------------------------------");
                        logger.error("[POWER]-Invalid entry");
                        System.out.println("-----------------------------------------------------------------------------------------");
                    }
                    else
                    {
                        result = power(first_number, second_number);
                        System.out.println("\n" + first_number + " RAISED TO THE POWER " + second_number + " IS --> " + result);
                        System.out.println("\n");
                    }
                    break;

        // ----------------------------------------------------- Exit -------------------------------------------------------------
                default:
                    System.out.println("Exiting....");
                    return;
            }
        } while (true);
    }

}


