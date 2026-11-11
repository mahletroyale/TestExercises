

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HealthPointsTest {

    @Test
    public void testFullHp() {
        HealthPoints character = new HealthPoints("Warrior", 100);

        assertEquals(100, character.getCurrentHp());
        assertEquals(100, character.getMaxHp());
    }

    @Test
    public void testIsAlive() {
        HealthPoints character = new HealthPoints("Warrior", 100);

        assertTrue(character.isAlive());
    }

    @Test
    public void testGetName() {
        HealthPoints character = new HealthPoints("Warrior", 100);

        assertEquals("Warrior", character.getName());
    }
}
