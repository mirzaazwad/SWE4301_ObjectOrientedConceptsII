package assignment2.ContentCoupling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestContentCoupling {
    @Test
    public void TestSumResultsEqual(){
        Calculator calculator=new Calculator();
        Numbers numbers=new Numbers(2,3);
        assertEquals(calculator.sum(numbers),calculator.Sum(numbers));
    }

    @Test
    public void TestSumExpected(){
        Calculator calculator=new Calculator();
        Numbers numbers=new Numbers(2,3);
        assertEquals(calculator.sum(numbers),5);
    }
}
