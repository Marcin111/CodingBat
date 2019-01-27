package codingbat.com.String2;

public class catDog {

//    Return true if the string "cat" and "dog" appear the same number of times in the given string.
//
//    catDog("catdog") → true
//    catDog("catcat") → false
//    catDog("1cat1cadodog") → true

    public boolean catDog(String str) {
        int cat = 0;
        int dog = 0;
        for (int i = 0; i+2<str.length(); i++){
            if(str.substring(i,i+3).equals("cat")){
                cat=cat+1;
            }
            if(str.substring(i,i+3).equals("dog")){
                dog=dog+1;
            }
        }
        return cat==dog;
    }

}
