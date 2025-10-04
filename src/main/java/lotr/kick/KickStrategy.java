package lotr.kick;

import lotr.Character;

/**
 * Defines how a character performs a kick against an opponent.
 */
@FunctionalInterface
public interface KickStrategy {
    void kick(Character self, Character target);
}
