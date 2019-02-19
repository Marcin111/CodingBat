package codingbat.com.String3;

public class sumNumbers {

//    Given a string, return the sum of the numbers appearing in the string, ignoring all other characters. A number is a series of 1 or more digit chars in a row. (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)
//
//    sumNumbers("abc123xyz") → 123
//    sumNumbers("aa11b33") → 44
//    sumNumbers("7 11") → 18

    public int sumNumbers(String str) {
        int count = 0;
        String digit = "";
        for (int i = 0; i<str.length(); i++){
            if ( Character.isDigit(str.charAt(i))){
                digit = digit + str.charAt(i);
            }
            if ( !Character.isDigit(str.charAt(i)) && !digit.equals("")
                    || i==str.length()-1 && !digit.equals("")){
                count = count + Integer.parseInt(digit);
                digit = "";
            }
        }
        return count;
    }

}
