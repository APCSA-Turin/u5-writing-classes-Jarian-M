public class AdditionPattern {
    private int start = 0;
    private int num = 0;
    private int mult = 0;
    public AdditionPattern(int start, int mult) {
        this.start = start;
        this.mult = mult;
        num = start;
    }
    public int currentNumber(){
        return num;
    }
    public void next(){
        num = num + mult;
    }
    public void prev(){
        if(num - mult >= start) {
            num = num - mult;
        }
    }
}
