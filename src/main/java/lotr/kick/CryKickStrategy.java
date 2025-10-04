package lotr.kick;

import lotr.Character;

/**
 * Strategy that leaves the opponent unharmed and simply cries.
 */
public class CryKickStrategy implements KickStrategy {
    @Override
    public void kick(Character self, Character target) {
        System.out.println("Hobbit is crying");
    }
}
