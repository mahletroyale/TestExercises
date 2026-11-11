
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CombatManagerTest {

    @Test
    public void testTurnOrder() {
        CombatManager combat = new CombatManager();

        combat.addFighter("Warrior", 10);
        combat.addFighter("Mage", 20);
        combat.addFighter("Archer", 15);

        String[] expected = {"Mage", "Archer", "Warrior"};

        assertArrayEquals(expected, combat.getTurnOrder());
    }

    @Test
    public void testSameSpeed() {
        CombatManager combat = new CombatManager();

        combat.addFighter("Warrior", 10);
        combat.addFighter("Mage", 20);
        combat.addFighter("Archer", 10);

        String[] expected = {"Mage", "Warrior", "Archer"};

        assertArrayEquals(expected, combat.getTurnOrder());
    }

    @Test
    public void testEmptyTurnOrder() {
        CombatManager combat = new CombatManager();

        String[] expected = {};

        assertArrayEquals(expected, combat.getTurnOrder());
    }

    @Test
    public void testFighterCount() {
        CombatManager combat = new CombatManager();

        combat.addFighter("Warrior", 10);
        combat.addFighter("Mage", 20);

        assertEquals(2, combat.getFighterCount());
    }
}
