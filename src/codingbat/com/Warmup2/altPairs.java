package codingbat.com.Warmup2;

public class altPairs {

//    Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".
//
//    altPairs("kitten") → "kien"
//    altPairs("Chocolate") → "Chole"
//    altPairs("CodingHorror") → "Congrr"

    public String altPairs(String str) {
        String word = "";
        for (int i = 0; i<str.length(); i=i+4){
            int l = i+2;
            if (l>str.length()){
                l=str.length();
            }
            word = word + str.substring(i,l);
        }
        return word;
    }


}
