
public class DamageCalculator {

    public DamageCalculator() {

    }

    public int calculateDamage(int attackPower, int defense) {
        int damage = attackPower - defense;

        return Math.max(0, damage);
    }

    public int calculateCriticalDamage(int attackPower, int defense) {
        int damage = calculateDamage(attackPower, defense);

        return damage * 2;
    }
}
