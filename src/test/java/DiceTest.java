
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DiceTest {

    @Test
    public void testNewDice() {
        Dice dice = new Dice();

        assertEquals(0, dice.getLastRoll());
    }

    @Test
    public void testRoll() {
        Dice dice = new Dice();

        dice.roll();

        int lastRoll = dice.getLastRoll();

        assertTrue(lastRoll >= 1 && lastRoll <= 6);
    }
}
