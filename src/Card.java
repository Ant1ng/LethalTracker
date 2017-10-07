/**
 * Created by Ant1ng on 10/7/17.
 */
public interface Card {
    int mana = 0;
    String type = null;

    static int getMana() {
        return mana;
    }

    static String getType() {
        return type;
    }
}
