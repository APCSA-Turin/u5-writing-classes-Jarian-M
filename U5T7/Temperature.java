public class Temperature {
    public double high = 0;
    public double low = 0;
    public String scale = "";
    public Temperature(double high, double low, String scale) {
        this.high = high;
        this.low = low;
        this.scale = scale;
        if(!scale.equals("C")) {
            scale = "F";
        }
    }
    public static double convertCToF(double temp) {
        return ((double)(temp * (9.0 / 5.0)) + 32);
    }
    public static double convertFToC(double temp) {
        return ((double)(temp - 32) * (5.0 / 9.0));
    }
    public void changeToC() {
        if(scale.equals("F")) {
            high = convertFToC(high);
            low = convertFToC(low);
            scale = "C";
        }
    }
    public void changeToF() {
        if(scale.equals("C")) {
            high = convertCToF(high);
            low = convertCToF(low);
            scale = "F";
        }
    }
    public String tempInfo() {
        String info = "";
        info += "High Temperature: " + high + " " + scale;
        info += "\nLow Temperature: " + low + " " + scale;
        return info;
    }

}
