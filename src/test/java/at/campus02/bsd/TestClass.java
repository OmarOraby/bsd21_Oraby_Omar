package at.campus02.bsd;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestClass {
    static private Calculator calculator;
    @BeforeEach
    public void setup(){
         calculator = new Calculator();
    }
    static private double result;

    @Test
    public void testAdd1(){
        Assertions.assertEquals(5, result = 2 + 3);
    }

    @Test
    public void testAdd2(){
        Assertions.assertEquals(1   +   1, calculator.add(1,1));
    }
    @Test
    public void testMinus1(){
        Assertions.assertEquals(5, result = 6 - 1);
    }
    @Test
    public void testMinus2(){
        Assertions.assertEquals(5, calculator.minus(6,1));
    }
    @Test
    public void testMultiply1(){
        Assertions.assertEquals(4, result = 2 * 2);
    }
    @Test
    public void testMultiply2(){
        Assertions.assertEquals(4*2, calculator.multiply(2,4));
    }
    @Test
    public void testDivide1(){
        Assertions.assertEquals(8/2, result = 8/2);
    }
    @Test
    public void testDivide2(){
        Assertions.assertEquals(4, calculator.divide(8,2));
    }
    @Test
    public void testFactorial1(){
        Assertions.assertEquals(1, calculator.factorial(1));
    }
    @Test
    public void testFactorial2(){
        Assertions.assertEquals(120, calculator.factorial(5));
    }
    @Test
    public void testFactorial3(){
        Assertions.assertEquals(720, calculator.factorial(6));
    }


}
