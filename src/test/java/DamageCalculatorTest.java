
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DamageCalculatorTest {

    @Test
    public void testNormalDamage() {
        DamageCalculator calculator = new DamageCalculator();

        assertEquals(30, calculator.calculateDamage(50, 20));
    }

    @Test
    public void testDamageNeverNegative() {
        DamageCalculator calculator = new DamageCalculator();

        assertEquals(0, calculator.calculateDamage(10, 20));
    }

    @Test
    public void testCriticalDamage() {
        DamageCalculator calculator = new DamageCalculator();

        assertEquals(60, calculator.calculateCriticalDamage(50, 20));
    }

    @Test
    public void testHigherDefense() {
        DamageCalculator calculator = new DamageCalculator();

        assertEquals(0, calculator.calculateDamage(20, 50));
        assertEquals(0, calculator.calculateCriticalDamage(20, 50));
    }
}
