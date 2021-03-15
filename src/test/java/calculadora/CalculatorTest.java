/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import junit.framework.TestCase;

/**
 *
 * @author melvin
 */
public class CalculatorTest extends TestCase {
    
    public CalculatorTest(String testName) {
        super(testName);
    }

    /**
     * Test of add method, of class Calculator.
     */
    public void testAdd() {
        System.out.println("add");
        double number1 = 0.0;
        double number2 = 0.0;
        Calculator instance = new Calculator();
        double expResult = 0.0;
        double result = instance.add(number1, number2);
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of subtract method, of class Calculator.
     */
    public void testSubtract() {
        System.out.println("subtract");
        double number1 = 0.0;
        double number2 = 0.0;
        Calculator instance = new Calculator();
        double expResult = 0.0;
        double result = instance.subtract(number1, number2);
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of multiply method, of class Calculator.
     */
    public void testMultiply() {
        System.out.println("multiply");
        double number1 = 0.0;
        double number2 = 0.0;
        Calculator instance = new Calculator();
        double expResult = 0.0;
        double result = instance.multiply(number1, number2);
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of divide method, of class Calculator.
     */
    public void testDivide() {
        System.out.println("divide");
        double number1 = 2.0;
        double number2 = 1.0;
        Calculator instance = new Calculator();
        double expResult = 2.0;
        double result = instance.divide(number1, number2);
        assertEquals(expResult, result, 0.0);
    }
    
}
