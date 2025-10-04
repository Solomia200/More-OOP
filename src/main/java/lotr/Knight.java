package lotr;

public class Knight extends Noble {
    private static final int MIN_STAT = 2;
    private static final int MAX_STAT = 12;

    public Knight() {
        super(MIN_STAT, MAX_STAT, MIN_STAT, MAX_STAT);
    }
}
