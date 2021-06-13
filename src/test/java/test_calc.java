import org.junit.Assert;
import org.junit.Test;
import сalculator.Calculator;

import static org.junit.Assert.assertTrue;

public class test_calc {
    @Test
    public void testCorrectAddition () throws Exception {
        Calculator calc = new Calculator(2.0, 2.0, "+");
        Assert.assertEquals("Сложение работает некорректно", 4.0,Calculator.getResult(), 0);
    }
    @Test
    public void testCorrectSubtraction () throws Exception {
        Calculator calc = new Calculator(2.0, 2.0, "-");
        Assert.assertEquals("Вычитание работает некорректно", 0.0,Calculator.getResult(), 0);
    }
    @Test
    public void testCorrectMultiplication () throws Exception {
        Calculator calc = new Calculator(2.0, 2.0, "*");
        Assert.assertEquals("Умножение работает некорректно", 4.0,Calculator.getResult(), 0);
    }
    @Test
    public void testCorrectDivision () throws Exception {
        Calculator calc = new Calculator(2.0, 2.0, "/");
        Assert.assertEquals("Деление работает некорректно", 1.0,Calculator.getResult(), 0);
    }
    @Test
    public void testSubtractionToZero () throws Exception {
        try {
            Calculator calc = new Calculator(2.0, 0.0, "/");
            Assert.fail("Expected exception");
        } catch (Exception e) {
           new Exception("На ноль делить нельзя");
        }

    }
    }