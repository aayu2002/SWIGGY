public class Main {
    public static void main(String[] args) {
        Player playerA = new Player(50, 5, 10);
        Player playerB = new Player(100, 10, 5);

        Arena arena = new Arena();
        arena.fight(playerA, playerB);

        if (playerA.isAlive()) {
            System.out.println("Player A wins!");
        } else {
            System.out.println("Player B wins!");
        }
    }
}
