import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {
    @Test
    public void testPlayerAttributes() {
        Player player = new Player(50, 5, 10);
        assertEquals(50, player.getHealth());
        assertEquals(5, player.getStrength());
        assertEquals(10, player.getAttack());
    }

    @Test
    public void testPlayerTakeDamage() {
        Player player = new Player(50, 5, 10);
        player.takeDamage(20);
        assertEquals(30, player.getHealth());
    }

    @Test
    public void testPlayerIsAlive() {
        Player player = new Player(50, 5, 10);
        assertTrue(player.isAlive());
        player.takeDamage(50);
        assertFalse(player.isAlive());
    }
}

public class DiceTest {
    @Test
    public void testDiceRoll() {
        Dice dice = new Dice();
        for (int i = 0; i < 100; i++) {
            int roll = dice.roll();
            assertTrue(roll >= 1 && roll <= 6);
        }
    }
}

public class ArenaTest {
    @Test
    public void testFight() {
        Player playerA = new Player(50, 5, 10);
        Player playerB = new Player(100, 10, 5);

        Arena arena = new Arena();
        arena.fight(playerA, playerB);

        assertFalse(playerA.isAlive() || playerB.isAlive());
    }
}
