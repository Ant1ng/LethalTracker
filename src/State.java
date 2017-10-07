import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ant1ng on 10/7/17.
 */
public class State {
    List<Minion> one_minions = new ArrayList<Minion>();
    List<Card> hand = new ArrayList<Card>();

    int current_mana;
    int board_size = 7;
    int hand_size = 10;
    int opponentHealth;

    boolean has_lethal;

    public State(int cM, int oH, List<Minion> minions, List<Card> cards) {
        current_mana = cM;
        opponentHealth = oH;
        one_minions = minions;
        hand = cards;
    }

    private int getAttackSum() {
        int sum = 0;
        for (int i = 0; i < board_size; i++){
            if (one_minions.get(i) != null) {
                sum += one_minions.get(i).getAttack();
            }
        }
        return sum;
    }

    private List<Integer> spellDamage(int current_mana, List<Card> current_hand) {
        for (int i = 0; i < current_hand.size(); i++) {
            Card card = current_hand.get(i);
            return null;
        }
        return null;
    }

    private int getMaxSpellDamage() {
        List<Integer> sums = new ArrayList<Integer>();



        //Find the max
        int max = 0;
        for (int num : sums) {
            if (max < num) {
                max = num;
            }
        }
        return max;
    }

    private int getDamageSum() {
        return 0;
    }

    public State play(Minion card, int index) {
        if (hand.contains(card) &&  one_minions.size() < board_size && current_mana > card.getMana() &&
                index > 0 && index < one_minions.size()) {
            List<Minion> new_minions = one_minions.subList(0, one_minions.size());
            new_minions.add(index, card);
            List<Card> new_hand = hand.subList(0, hand.size());
            new_hand.remove(card);
            return new State(current_mana - card.getMana(), opponentHealth, new_minions, new_hand);
        }
        return null;
    }

    public boolean hasLethal() {
        has_lethal = getAttackSum() > opponentHealth;
        return has_lethal;
    }

}
