package at.campus02.bsd;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Main {
    public static Calculator calculator = new Calculator();
    private static Logger logger = LogManager.getLogger();


    public static void main(String[] args) {
        calculator.add(5,4);
        System.out.println(calculator.multiply(5,4));
        calculator.minus(5,1);
        System.out.println(calculator.divide(15,5));
    }
}
