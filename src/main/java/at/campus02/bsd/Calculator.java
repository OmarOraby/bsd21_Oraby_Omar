package at.campus02.bsd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/**
 * @author Omar Oraby
 */
public class Calculator {
private static Logger logger = LogManager.getLogger();

    /**
     * Adds two numbers
     * @param number1 first number
     * @param number2 second number
     * @return The result
     */
    public double add(double number1, double number2){
    double result = number1+number2;
        logger.debug(number1 + "+" + number2);
        return result;

    }

    /**
     * Subtracts two numbers
     * @param number1 first number
     * @param number2 second number
     * @return The result
     */
    public double minus(double number1, double number2){
        double result = number1-number2;
        logger.debug(number1 + "-" + number2);
        return result;
    }

    /**
     * Divides two numbers
     * @param number1 first number
     * @param number2 second number
     * @return The result
     */
    public double divide(double number1, double number2) throws ArithmeticException{
        double result = number1/number2;
        logger.debug(number1 + "/" + number2);
        if(number2 == 0){
            logger.error(number2 + "Zero division, not allowed");
            throw new ArithmeticException();
        }
        return result;
    }

    /**
     * Multiplies two numbers
     * @param number1 first number
     * @param number2 second number
     * @return The result
     */
    public double multiply(double number1, double number2){
        double result = number1*number2;
        logger.debug(number1 + "*" + number2);
        return result;
    }

    /**
     *
     * @param f is the number that is used for the faculty
     * @return the faculty of the number
     */
    public double factorial(int f) {
        logger.debug("Faculty of " + f);
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }
}
