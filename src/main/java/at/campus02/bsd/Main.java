package at.campus02.bsd;

public class Main {
    public static Calculator calculator = new Calculator();

    public static void main(String[] args) {
        calculator.add(5,4);
        System.out.println(calculator.multiply(5,4));
        calculator.minus(5,1);
        System.out.println(calculator.divide(15,5));
    }
}
