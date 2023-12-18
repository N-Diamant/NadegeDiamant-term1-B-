package devopsexam.example.exam.util;

import org.junit.jupiter.api.Test;
import devopsexam.example.exam.exceptions.*;
import devopsexam.example.exam.serviceImpls.MathOperatorImpl

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    private  MathOperatorImpl mathOperatorService = new MathOperatorImpl();
    @Test
    void WhenAdd_returnSum() throws rca.devopsexam.v1.exceptions.InvalidOperationException {
        double actual = mathOperatorService.doMath( 3, 1,"+");
        double expected  = 4;
        assertEquals(actual,expected);
    }
    @Test
    public void WhenAddWithZero_returnNumber() throws rca.devopsexam.v1.exceptions.InvalidOperationException, rca.devopsexam.v1.exceptions.InvalidOperationException {
        assertEquals(mathOperatorService.doMath(3, 0,"+"),3.0);
    }
}