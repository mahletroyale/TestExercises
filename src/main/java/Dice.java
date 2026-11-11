
import java.util.Random;

public class Dice {

    private int lastRoll;
    private Random random;

    public Dice() {
        lastRoll = 0;
        random = new Random();
    }

    public int getLastRoll() {
        return lastRoll;
    }

    public int roll() {
        lastRoll = random.nextInt(6) + 1;
        return lastRoll;
    }
}

