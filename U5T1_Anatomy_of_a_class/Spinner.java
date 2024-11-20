package U5T1_Anatomy_of_a_class;

public class Spinner {
    private int sections;
    private int recentSpin;
    private int sumSpins;
    private int count;

    public Spinner(int sections) {
        this.sections = sections;
        recentSpin = 0;
        sumSpins = 0;
        count = 0;
    }

    public int getCount() {
        return count;
    }

    public int getSpinValue() {
        return recentSpin;
    }

    public int getSpinCount() {
        return count;
    }

    public int getSpinSum() {
        return sumSpins;
    }
    public void spin() {
        int spin = (int)(Math.random() * sections + 1);
        recentSpin = spin;
        sumSpins += recentSpin;
        count++;
    }

    public double averageSpin() {
        double averageSpin = sumSpins / count;
        return averageSpin;
    }


}
