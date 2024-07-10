public class Arena {

    private Dice dice;

    public Arena() {
        this.dice = new Dice();
    }

    public void fight(Player player1, Player player2) {
        while (player1.isAlive() && player2.isAlive()) {
            if (player1.getHealth() < player2.getHealth()) {
                attack(player1, player2);
            } else {
                attack(player2, player1);
            }
        }
    }

    private void attack(Player attacker, Player defender) {
        int attackRoll = dice.roll();
        int defendRoll = dice.roll();

        int attackDamage = attacker.getAttack() * attackRoll;
        int defendDamage = defender.getStrength() * defendRoll;
        int damage = Math.max(0, attackDamage - defendDamage);

        defender.takeDamage(damage);

        System.out.println(attacker + " attacked " + defender + " for " + damage + " damage. " +
                           defender + " has " + defender.getHealth() + " health remaining.");
    }
}
