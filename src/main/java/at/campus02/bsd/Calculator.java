package at.campus02.bsd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/**
 * @author Omar Oraby
 */
public class Calculator {


    /**
     * Adds two numbers
     * @param number1 first number
     * @param number2 second number
     * @return The result
     */
    public double add(double number1, double number2){

        return number1+number2;

    }

    /**
     * Subtracts two numbers
     * @param number1 first number
     * @param number2 second number
     * @return The result
     */
    public double minus(double number1, double number2){
        return number1-number2;
    }

    /**
     * Divides two numbers
     * @param number1 first number
     * @param number2 second number
     * @return The result
     */
    public double divide(double number1, double number2){
        return number1/number2;
    }

    /**
     * Multiplies two numbers
     * @param number1 first number
     * @param number2 second number
     * @return The result
     */
    public double multiply(double number1, double number2){
        return number1*number2;
    }

    /**
     *
     * @param f is the number that is used for the faculty
     * @return the faculty of the number
     */
    public double factorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }
}
