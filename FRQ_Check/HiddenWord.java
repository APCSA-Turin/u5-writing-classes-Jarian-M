public class HiddenWord {
    private String word;
    private int len;
    public HiddenWord(String word){
        this.word = word;
        len = word.length();
    }
    public String getHint(String hint) {
        String hintWord = "";
        for(int i = 0; i < len; i++) {
            String word1 = word.substring(i, i + 1);
            String word2 = hint.substring(i, i + 1);
            if(word.indexOf(word2) != -1) {
                if(word1.equals(word2)){
                    hintWord += word2;
                } else {
                    hintWord += "+";
                }
            } else {
                hintWord += "*";
            }
        }
        return hintWord;
    }
}
   