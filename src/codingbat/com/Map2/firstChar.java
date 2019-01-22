package codingbat.com.Map2;

import java.util.HashMap;
import java.util.Map;

public class firstChar {

//    Given an array of non-empty strings, return a Map<String, String> with a key for every different first character seen, with the value of all the strings starting with that character appended together in the order they appear in the array.
//
//    firstChar(["salt", "tea", "soda", "toast"]) → {"s": "saltsoda", "t": "teatoast"}
//    firstChar(["aa", "bb", "cc", "aAA", "cCC", "d"]) → {"a": "aaaAA", "b": "bb", "c": "cccCC", "d": "d"}
//    firstChar([]) → {}

    public Map<String, String> firstChar(String[] strings) {
        Map<String,String> map = new HashMap<String,String>();

        for (String s:strings){
            if (!map.containsKey(String.valueOf(s.charAt(0)))){
                map.put(String.valueOf(s.charAt(0)),s);
            }else{
                String param = map.get(String.valueOf(s.charAt(0)));
                map.put(String.valueOf(s.charAt(0)),param+s);
            }
        }
        return map;
    }

}
