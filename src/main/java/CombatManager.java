
import java.util.ArrayList;

public class CombatManager {

    private ArrayList<Fighter> fighters;

    public CombatManager() {
        fighters = new ArrayList<>();
    }

    private static class Fighter {
        String name;
        int speed;

        public Fighter(String name, int speed) {
            this.name = name;
            this.speed = speed;
        }
    }

    public void addFighter(String name, int speed) {
        fighters.add(new Fighter(name, speed));
    }

    public String[] getTurnOrder() {

        ArrayList<Fighter> sortedFighters = new ArrayList<>(fighters);

        sortedFighters.sort((fighter1, fighter2) -> Integer.compare(fighter2.speed, fighter1.speed));

        String[] turnOrder = new String[sortedFighters.size()];

        for (int i = 0; i < sortedFighters.size(); i++) {
            turnOrder[i] = sortedFighters.get(i).name;
        }

        return turnOrder;
    }

    public int getFighterCount() {
        return fighters.size();
    }
}
