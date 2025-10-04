package lotr;

public class GameManager {
    public void fight(Character c1, Character c2) {
        System.out.printf("Battle begins: %s vs %s%n", c1, c2);
        int round = 1;
        while (c1.isAlive() && c2.isAlive()) {
            System.out.printf("-- Round %d --%n", round);
            boolean progress = performKick(c1, c2);
            if (!c2.isAlive()) {
                break;
            }
            progress |= performKick(c2, c1);
            if (!c1.isAlive()) {
                break;
            }
            if (!progress) {
                System.out.println("Nobody can harm the opponent. The fight ends in a draw.");
                break;
            }
            round++;
        }
        announceWinner(c1, c2);
    }

    private boolean performKick(Character attacker, Character defender) {
        int beforeHp = defender.getHp();
        int beforePower = defender.getPower();
        System.out.printf("%s kicks %s%n", attacker, defender);
        attacker.kick(defender);
        System.out.printf("Result: %s{hp=%d, power=%d}%n", defender.getClass().getSimpleName(), defender.getHp(), defender.getPower());
        return beforeHp != defender.getHp() || beforePower != defender.getPower();
    }

    private void announceWinner(Character c1, Character c2) {
        if (c1.isAlive() && !c2.isAlive()) {
            System.out.printf("Winner: %s%n", c1);
        } else if (!c1.isAlive() && c2.isAlive()) {
            System.out.printf("Winner: %s%n", c2);
        } else if (!c1.isAlive() && !c2.isAlive()) {
            System.out.println("Both characters fell.");
        } else {
            System.out.println("The fight ended without a victor.");
        }
    }
}
