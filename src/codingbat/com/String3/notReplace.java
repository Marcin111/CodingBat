package codingbat.com.String3;

public class notReplace {

//    Given a string, return a string where every appearance of the lowercase word "is" has been replaced with "is not". The word "is" should not be immediately preceeded or followed by a letter -- so for example the "is" in "this" does not count. (Note: Character.isLetter(char) tests if a char is a letter.)
//
//    notReplace("is test") → "is not test"
//    notReplace("is-is") → "is not-is not"
//    notReplace("This is right") → "This is not right"

    public String notReplace(String str) {
        String word = "";
        for ( int i = 0; i<str.length(); i++){
            if ( i>0 && i<(str.length()-2) &&
                    str.substring(i,i+2).equals("is") &&
                    !Character.isLetter(str.charAt(i+2)) &&
                    !Character.isLetter(str.charAt(i-1))  ||
                    i==0 && str.length()>2 &&
                            str.substring(i,i+2).equals("is") &&
                            !Character.isLetter(str.charAt(i+2)) ||
                    i==0 && str.length()==2 &&
                            str.equals("is") ||
                    i==str.length()-2 &&
                            str.substring(i).equals("is") &&
                            !Character.isLetter(str.charAt(i-1))){
                word = word + "is not";
                i++;
            } else {
                word = word + str.charAt(i);
            }
        }
        return word;
    }

}
