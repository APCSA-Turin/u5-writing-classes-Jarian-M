public class StepTracker {
    private int activeSteps;
    private int total = 0;
    private int days = 0;
    private int active = 0;
    private double avg = 0;
    public StepTracker(int activeSteps) {
        this.activeSteps = activeSteps;
        days = 0;
        active = 0;
        total = 0;
        avg = 0;
    }
    public void addDailySteps(int steps){
        if(steps > activeSteps){
            active++;
        }
        total += steps;
        days++;
    }
    public int activeDays(){
        return active;
    }
    public double averageSteps(){
        if(days == 0) {
            return days;
        }
        avg = total / days;
        return avg;
    }
}
