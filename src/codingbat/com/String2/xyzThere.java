package codingbat.com.String2;

public class xyzThere {

//    Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.
//
//    xyzThere("abcxyz") → true
//    xyzThere("abc.xyz") → false
//    xyzThere("xyz.abc") → true

    public boolean xyzThere(String str) {
        if (str.contains("xyz") && !str.contains(".xyz")){
            return true;
        }
        for (int i=str.length();i>=4;i--){
            if(str.substring(i-3,i).equals("xyz") && str.charAt(i-4)!='.'){
                return true;
            }
        }
        return false;
    }

}
