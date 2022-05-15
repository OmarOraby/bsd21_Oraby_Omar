package at.campus02.bsd;

public class Calculator {
    public double add(double number1, double number2){
        return number1+number2;
    }
    public double minus(double number1, double number2){
        return number1-number2;
    }
    public double divide(double number1, double number2){
        return number1/number2;
    }
    public double multiply(double number1, double number2){
        return number1*number2;
    }
    public double factorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }
}
