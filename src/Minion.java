/**
 * Created by Ant1ng on 10/7/17.
 */
public class Minion implements Card {

    private int mana;
    private int attack;
    private int health;
    private int current_health;
    private String effect;
    private String tribe;
    private boolean disabled;

    public Minion() {
        mana = 0;
        attack = 0;
        health = 0;
        current_health = health;
        effect = null;
        tribe = null;
        disabled = false;
    }

    public Minion(
            int mana,
            int attack,
            int health,
            int current_health,
            String effect,
            String tribe) {
        this.mana = mana;
        this.attack = attack;
        this.health = health;
        this.current_health = current_health;
        this.effect = effect;
        this.tribe = tribe;
    }

    public int getAttack() {
        return attack;
    }

    public int getMana() {
        return mana;
    }

    public int getMaxHealth(){
        return health;
    }

    public int getCurrent_health() {
        return current_health;
    }
}
