package codingbat.com.String3;

public class withoutString {

//    Given two strings, base and remove, return a version of the base string where all instances of the remove string have been removed (not case sensitive). You may assume that the remove string is length 1 or more. Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
//
//    withoutString("Hello there", "llo") → "He there"
//    withoutString("Hello there", "e") → "Hllo thr"
//    withoutString("Hello there", "x") → "Hello there"

    public String withoutString(String base, String remove) {
        String word = "";
        for (int i = 0; i<base.length(); i++){
            if (i<base.length()-remove.length()+1){
                if (!base.substring(i,remove.length()+i).toLowerCase().equals(remove.toLowerCase())){
                    word = word + base.charAt(i);
                } else {
                    i = i + remove.length()-1;
                }
            } else {
                word = word + base.charAt(i);
            }
        }
        return word;
    }

}
