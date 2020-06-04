public class GuessMyWord {
    public String createWord(String word2){
        return word2;
    }
    public int compare(String word, String word2){
        int compare = 0;
        if(word.compareTo(word2) > 0){
            compare = 1;
        }else if(word.compareTo(word2) == 0){
            compare = 0;
        }else{
            compare = -1;        }
    }
    public void guess(String word){
        word = word.toLowerCase();

        }
    public static void main(String[] args){
        
    }



    }