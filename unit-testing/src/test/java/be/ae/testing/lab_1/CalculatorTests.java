package be.ae.testing.lab_1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTests {

    @Test
    @DisplayName("Example test: can add 1 and 2")
    void givenNumbersOneAndTwo_whenAdd_thenResultIsThree() {
        Calculator calculator = new Calculator();
        int result = calculator.add(1, 2);
        assertEquals(3, result);
    }

}
