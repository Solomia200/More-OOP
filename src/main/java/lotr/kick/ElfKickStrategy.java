package lotr.kick;

import lotr.Character;

/**
 * Strategy used by elves: kill weaker enemies or reduce their power.
 */
public class ElfKickStrategy implements KickStrategy {
    @Override
    public void kick(Character self, Character target) {
        if (target.getPower() < self.getPower()) {
            target.setHp(0);
        } else {
            target.setPower(target.getPower() - 1);
        }
    }
}
