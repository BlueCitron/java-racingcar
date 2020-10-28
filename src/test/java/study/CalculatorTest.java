package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import study.calculator.Calculator;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @ParameterizedTest
    @CsvSource(value = {"2 + 3,5", "1 + 1 + 3, 5"}, delimiter = ',')
    @DisplayName("덧셈")
    void test_plus(String expression, Integer result) {
        assertEquals(calculator.calculate(expression), result);
    }

    @ParameterizedTest
    @CsvSource(value = {"7 - 4,3", "9 - 2 - 5,2"}, delimiter = ',')
    @DisplayName("뺄셈")
    void test_minus(String expression, Integer result) {
        assertEquals(calculator.calculate(expression), result);
    }

}