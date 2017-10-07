import static org.junit.Assert.*;
import org.junit.Test;
import java.util.List;
import java.util.ArrayList;
/**
 * Created by Ant1ng on 10/7/17.
 */
    public class MinionTest {

        @Test
        public void enoughAttack() {
            List<Minion> minions = new ArrayList<Minion>();
            Minion n = new Minion(0, 5, 5, 5, null, null);
            for (int i = 0; i < 7; i++) {
                minions.add(n);
            }
            State state = new State(99, 30, minions, null);
            assertTrue(state.hasLethal());
        }


    }
