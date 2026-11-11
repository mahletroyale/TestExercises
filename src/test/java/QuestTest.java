
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuestTest {

    @Test
    public void testNewQuest() {
        Quest quest = new Quest("Find the Treasure", 100);

        assertEquals(0, quest.getCurrentProgress());
        assertFalse(quest.isCompleted());
    }

    @Test
    public void testAddProgress() {
        Quest quest = new Quest("Find the Treasure", 100);

        quest.addProgress(30);

        assertEquals(30, quest.getCurrentProgress());
    }

    @Test
    public void testQuestCompleted() {
        Quest quest = new Quest("Find the Treasure", 100);

        quest.addProgress(100);

        assertTrue(quest.isCompleted());
    }

    @Test
    public void testCompletionPercentage() {
        Quest quest = new Quest("Find the Treasure", 100);

        quest.addProgress(50);

        assertEquals(50, quest.getCompletionPercentage());
    }

    @Test
    public void testPercentageNeverAbove100() {
        Quest quest = new Quest("Find the Treasure", 100);

        quest.addProgress(150);

        assertEquals(100, quest.getCompletionPercentage());
        assertTrue(quest.isCompleted());
    }
}
