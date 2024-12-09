public class Cars {
    private static int totalMiles = 0;
    private static int longestDrive = 0;
    private static int totalCars = 0;
    private int miles = 0;
    private String name = "";

    public Cars(String name) {
        miles = 0;
        this.name = name;
        totalCars++;
    }

    public static int getTotal() {
        return totalMiles;
    }

    public static int getLongest() {
        return longestDrive;
    } 

    public static int getCars() {
        return totalCars;
    } 

    public int getMiles() {
        return miles;
    }

    public String getName() {
        return name;
    }

    public void drive(int numMiles) {
        miles += numMiles;
        totalMiles += numMiles;
        if(numMiles > longestDrive) {
            longestDrive = numMiles;
        }
    }

}
