package guru.qa.service;

import guru.qa.service.mock.MockMultReader;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class CalculatorTest {

    private Calculator calculator;

    @Test
    void calculatorTest() {
        calculator = new Calculator(new MockMultReader()); // 8, 4, /
        String result = calculator.start();
        Assertions.assertEquals("8 / 4 = 2", result);
    }
}