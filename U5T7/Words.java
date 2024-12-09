public class Words {
    private Words(){}
    public static boolean doesContain(String str1, String str2) {
        if(str2.indexOf(str1) != -1) {
            return true;
        } else {
            return false;
        }
    }

    public static void printReverse(String str) {
        int len = str.length();
        String newStr = "";
        for(int i = 0; i < len - 1; i++) {
            newStr = " " + str.substring(i, i + 1) + newStr;
        }
        newStr = str.substring(len - 1, len) + newStr;
        System.out.println(newStr);
    }
}