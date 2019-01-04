package codingbat.com.String1;

public class withoutX2 {

//    Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars, and otherwise return the string unchanged. This is a little harder than it looks.
//
//    withoutX2("xHi") → "Hi"
//    withoutX2("Hxi") → "Hi"
//    withoutX2("Hi") → "Hi"

    public String withoutX2(String str) {
        int begin = 0;
        int end = str.length();
        boolean param = false;

        if (str.length()==0 ){
            return "";
        }

        if (str.length()==1 && str.charAt(0)=='x'){
            return "";
        }

        if(str.charAt(0)=='x'){
            begin++;
            param = true;
        }
        if(str.charAt(1)=='x'){
            begin++;
        }
        if( param ){
            return str.substring(begin,end);
        } else if ( !param && str.charAt(1)=='x'){
            return String.valueOf(str.charAt(0))+str.substring(2,end);
        } else {
            return str;
        }

    }

}
