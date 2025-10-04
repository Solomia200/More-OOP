package lotr;

import lotr.kick.ElfKickStrategy;

public class Elf extends Character {
    public Elf() {
        super(10, 10);
    }

    @Override
    public void kick(Character target) {
        new ElfKickStrategy().kick(this, target);
    }
}
