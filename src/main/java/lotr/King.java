package lotr;

public class King extends Noble {
    private static final int MIN_STAT = 5;
    private static final int MAX_STAT = 15;

    public King() {
        super(MIN_STAT, MAX_STAT, MIN_STAT, MAX_STAT);
    }
}
