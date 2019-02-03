package codingbat.com.String2;

public class repeatSeparator {

//    Given two strings, word and a separator sep, return a big string made of count occurrences of the word, separated by the separator string.
//
//    repeatSeparator("Word", "X", 3) → "WordXWordXWord"
//    repeatSeparator("This", "And", 2) → "ThisAndThis"
//    repeatSeparator("This", "And", 1) → "This"

    public String repeatSeparator(String word, String sep, int count) {
        if (count==0){
            return "";
        }
        if (count==1){
            return word;
        }
        String bigWord = word;
        for ( int i = 2 ; i<=count; i++){
            bigWord = bigWord + sep + word;
        }
        return bigWord;
    }

}
