package U5T1_Anatomy_of_a_class;
public class Dice {
    private int sides;
    private int count;
    private int recentRoll;

    public Dice (int sides) {
        this.sides = sides;
        recentRoll = 0;
        recentRoll = 0;
        count = 0;
    }
    
    public int getSides() {
        return sides;
    }
    
    public int getRoll() {
        return recentRoll;
    }

    public int getCount() {
        return count;
    }

    public void sideChange(int sideChange) {
        sides = sideChange;
    }

    public void roll() {
        int roll = (int)(Math.random() * sides + 1);
        recentRoll = roll;
        count++;
    }
}
