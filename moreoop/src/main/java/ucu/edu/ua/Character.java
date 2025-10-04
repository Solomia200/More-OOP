package lotr;

/**
 * Base class for all playable characters.
 */
public abstract class Character {
    private int power;
    private int hp;

    protected Character(int power, int hp) {
        this.power = Math.max(power, 0);
        this.hp = Math.max(hp, 0);
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = Math.max(power, 0);
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = Math.max(hp, 0);
    }

    public abstract void kick(Character target);

    public boolean isAlive() {
        return hp > 0;
    }

    @Override
    public String toString() {
        return String.format("%s{hp=%d, power=%d}", getClass().getSimpleName(), hp, power);
    }
}


// public abstract class Character{
//     private int power; 
//     private int hp ;
//     private KickStrategy kickStrategy;

    

    
//     public void kick( Character target){
//         kickStrategy.kick(c : this, target);
//     }

//     public boolen isAlive(){

//     }
    
// }

//     public KickStrategy getKickStrategy() {
//         return kickStrategy;
//     }

//     public void setKickStrategy(KickStrategy kickStrategy) {
//         this.kickStrategy = kickStrategy;
//     }