package nivel3.exercise1;

import com.itacademy.nivel3.exercise1.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void shouldInitializeCalculatorWithTotalZero() {
        assertThat(calculator.getTotal()).isEqualTo(0);
    }

    @Test
    public void shouldIncrementTotal() {
        calculator.add(10);
        assertThat(calculator.getTotal()).isEqualTo(10);
    }

    @Test
    public void shouldDecrementTotal() {
        calculator.subtract(10);
        assertThat(calculator.getTotal()).isEqualTo(-10);
    }

    @Test
    public void shouldMultiplyTotalByGivenValue() {
        calculator.multiply(4);
        assertThat(calculator.getTotal()).isEqualTo(0);
    }

    @Test
    public void shouldDivideTotalByGivenValue() {
        calculator.add(10);
        calculator.divide(2);
        assertThat(calculator.getTotal()).isEqualTo(5);
    }

    @Test
    public void shouldThrowArithmeticExceptionIfNumberIsZero() {
        assertThatExceptionOfType(ArithmeticException.class)
                .isThrownBy(() -> calculator.divide(0));
    }

    @Test
    public void shouldReturnTotalToZero() {
        calculator.add(7);
        calculator.reset();
        assertThat(calculator.getTotal()).isEqualTo(0);
    }

}
