public class Main7 {
    public static void main(String[] args) {
        System.out.println("--- 3 random numbers between 1 and 10 ---");
        Nums myNum1 = new Nums(1, 10);
        for (int i = 0; i < 3; i++) {
        System.out.println(myNum1.randBetween());
        }
        System.out.println("Random numbers generated by myNum1: " + myNum1.getRandomNumsGenerated());
        System.out.println("Total random numbers generated by all Nums objects: " + Nums.getTotalRandomNumsGenerated());
        System.out.println("\n--- 6 random numbers between 50 and 100 ---");
        Nums myNum2 = new Nums(50, 100);
        for (int i = 0; i < 6; i++) {
        System.out.println(myNum2.randBetween());
        }
        System.out.println("Random numbers generated by myNum2: " + myNum2.getRandomNumsGenerated());
        System.out.println("Total random numbers generated by all Nums objects: " + Nums.getTotalRandomNumsGenerated());
        System.out.println("\n--- 8 random numbers between 1000 and 2000 ---");
        Nums myNum3 = new Nums(1000, 2000);
        for (int i = 0; i < 8; i++) {
        System.out.println(myNum3.randBetween());
        }
        System.out.println("Random numbers generated by myNum3: " + myNum3.getRandomNumsGenerated());
        System.out.println("Total random numbers generated by all Nums objects: " + Nums.getTotalRandomNumsGenerated());

    }        
}