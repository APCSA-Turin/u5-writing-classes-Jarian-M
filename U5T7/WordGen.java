public class WordGen {
    public String specialC = "";
    public String pass = "";
    public String user = "";
    public String num = "";
    public WordGen(String specialC, String pass, String num, String user){
        this.specialC = specialC;
        this.pass = pass;
        this.user = user;
        this.num = num;
    }
    private static String noVowels(String word) {
        String temp = WordCheck.remove(word, "a"); //E
        temp = WordCheck.remove(temp, "e");
        temp = WordCheck.remove(temp, "i");
        temp = WordCheck.remove(temp, "o");
        temp = WordCheck.remove(temp, "u");
        return temp;
    }
    public static int numGen(int min, int max) {
        return (int)(Math.random() * (max - min + 1) + min);
    }
    public String newPass() {
        String newPass = noVowels(pass); //C
        newPass = newPass.toUpperCase();
        newPass = specialC + newPass; //B
        newPass += num;
        return newPass;
    }
    public String newUser() {
        String newUser = noVowels(user);
        newUser = newUser.toLowerCase();
        int num1 = numGen(1, 10); //D
        int num2 = numGen(10, 100);
        newUser = "" + num1 + newUser;
        newUser += num2;
        return newUser;
    }
}
