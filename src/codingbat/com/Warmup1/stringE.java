package codingbat.com.Warmup1;

public class stringE {

//    Return true if the given string contains between 1 and 3 'e' chars.
//
//    stringE("Hello") → true
//    stringE("Heelle") → true
//    stringE("Heelele") → false

    public boolean stringE(String str) {
        int a = 0;
        for (int i = 0; i<str.length() ; i++){
            if (str.charAt(i)=='e'){
                a++;
            }
        }
        if (a>0 && a<=3){
            return true;
        }
        return false;
    }


}
