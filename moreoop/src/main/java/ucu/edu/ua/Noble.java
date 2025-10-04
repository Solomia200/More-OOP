package lotr;

import java.util.concurrent.ThreadLocalRandom;


import lotr.kick.NobleKickStrategy;

abstract class Noble extends Character {

    protected Noble(int minPower, int maxPower, int minHp, int maxHp) {
        super(randomBetween(minPower, maxPower), randomBetween(minHp, maxHp));
    }

    private static int randomBetween(int minInclusive, int maxInclusive) {
        return ThreadLocalRandom.current().nextInt(minInclusive, maxInclusive + 1);
    }

    @Override
    public void kick(Character target) {
        new NobleKickStrategy().kick(this, target);
    }
}
