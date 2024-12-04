public class RaceUtility {
    private RaceUtility(){}
    public static double milesToKm(double miles) {
        return(miles * 1.609344);
    }
    public static double kmToMiles(double km) {
        return(km * 0.62137);
    }
    public static String makeProper(String str) {
        int len = str.length();
        String newStr = "";
        String first = str.substring(0,1);
        newStr += first.toUpperCase();
        for(int i = 1; i < len; i++) {
            if(str.substring(i - 1, i).equals(" ")) {
                String temp = str.substring(i, i + 1);
                newStr += temp.toUpperCase();
            } else {
                String temp2 = str.substring(i, i + 1);
                newStr += temp2.toLowerCase();
            }
        }
        return newStr;
    }
}
