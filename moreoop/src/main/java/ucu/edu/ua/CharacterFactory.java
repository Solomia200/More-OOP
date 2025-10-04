package lotr;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;

public class CharacterFactory {
    private final List<Supplier<Character>> constructors = List.of(
            Hobbit::new,
            Elf::new,
            King::new,
            Knight::new
    );

    public Character createCharacter() {
        int index = ThreadLocalRandom.current().nextInt(constructors.size());
        return constructors.get(index).get();
    }
}
