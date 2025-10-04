package lotr.kick;

import java.util.concurrent.ThreadLocalRandom;
import lotr.Character;

/**
 * Strategy that inflicts random damage up to the attacker's power.
 */
public class NobleKickStrategy implements KickStrategy {
    @Override
    public void kick(Character self, Character target) {
        int damage = ThreadLocalRandom.current().nextInt(0, self.getPower() + 1);
        target.setHp(target.getHp() - damage);
    }
}
