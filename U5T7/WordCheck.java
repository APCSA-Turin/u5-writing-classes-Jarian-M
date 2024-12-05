public class WordCheck {
    private WordCheck(){};
    private static String reverse(String word) {
        int len = word.length();
        String newWord = "";
        for(int i = 0; i < len; i++) {
            newWord = word.substring(i, i + 1) + newWord;
        }
        return newWord;
    }
    public static boolean isPalindrome(String word) {
        String palindrome = reverse(word); //A
        if(palindrome.equals(word)) {
            return true;
        } else {
            return false;
        }
    }
    public static String remove(String word, String letter) {
        int len = word.length();
        String temp = word;
        String temp2 = "";
        for(int i = 0; i < len; i++) {
            if(!temp.substring(i, i + 1).equals(letter)) {
                temp2 += temp.substring(i, i + 1);
            }
        }
        return temp2;
    }
}
