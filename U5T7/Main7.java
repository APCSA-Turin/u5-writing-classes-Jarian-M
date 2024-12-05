public class Main7 {
    /*public static double cArea(double radius) {
        return (Math.pow(radius,2) * 3.1415);
    } */
    public static void main (String[] args) {
        WordGen newGen = new WordGen("$&", "PassWord", "21", "Jarian");
        newLogin login = new newLogin(newGen);
        System.out.println(login.getPass());
        System.out.println(login.getUser());
    }
}