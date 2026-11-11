

public class HealthPoints {

    private String name;
    private int maxHp;
    private int currentHp;


    public HealthPoints(String name, int maxHp) {
        this.name = name;
        this.maxHp = maxHp;
        this.currentHp = maxHp;
    }

    public String getName() {
        return name;
    }

    public int getCurrentHp() {
        return currentHp;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public boolean isAlive() {
        return currentHp > 0;
    }
}
