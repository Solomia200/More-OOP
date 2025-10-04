package lotr;

import lotr.kick.CryKickStrategy;


public class Hobbit extends Character {
    public Hobbit() {
        super(0, 3);
    }

    @Override
    public void kick(Character target) {
        new CryKickStrategy().kick(this, target);
    }
}
