package gcukakao.jenkins.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
@SuppressWarnings("unused")
public class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    @DisplayName("Sum test")
    public void testSum() {
        int result = calculator.sum(2, 3);
        assertEquals(5, result);
        System.out.println("Sum test completed successfully! Result: " + result);
    }

    @Test
    @DisplayName("Subtraction test")
    public void testSub() {
        int result = calculator.sub(3, 6);
        assertEquals(-3, result);
        System.out.println("Subtraction test completed successfully! Result: " + result);
    }

    @Test
    @DisplayName("Multiplication test")
    public void testMul() {
        int result = calculator.mul(2, 5);
        assertEquals(10, result);
        System.out.println("Multiplication test completed successfully! Result: " + result);
    }

    @Test
    @DisplayName("Division test")
    public void testDiv() {
        int result = calculator.div(12, 2);
        assertEquals(6, result);
        System.out.println("Division test completed successfully! Result: " + result);
    }
}
