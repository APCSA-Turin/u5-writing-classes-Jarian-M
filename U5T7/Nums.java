public class Nums {
    private int num1 = 0;
    private int num2 = 0;
    private int times = 0;
    private static int total = 0;

    public Nums(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        times = 0;
    }

    public int randBetween() {
        times++;
        total++;
        return (int)(Math.random() * (num2 - num1 + 1) + num1);
    }

    public int getRandomNumsGenerated() {
        return times;
    }

    public static int getTotalRandomNumsGenerated() {
        return total;
    }
}