
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {

    @Test
    public void testNewPlayerScore() {
        Player player = new Player("Mahlet");

        assertEquals(0, player.getScore());
    }

    @Test
    public void testGetName() {
        Player player = new Player("Mahlet");

        assertEquals("Mahlet", player.getName());
    }

    @Test
    public void testAddPoints() {
        Player player = new Player("Mahlet");

        player.addPoints(10);

        assertEquals(10, player.getScore());
    }
}
