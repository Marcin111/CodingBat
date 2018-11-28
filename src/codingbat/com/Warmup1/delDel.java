package codingbat.com.Warmup1;

public class delDel {

//    Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted. Otherwise, return the string unchanged.
//
//    delDel("adelbc") → "abc"
//    delDel("adelHello") → "aHello"
//    delDel("adedbc") → "adedbc"

    public String delDel(String str) {
        if(str.length()>=4&&str.charAt(1)=='d'&&str.charAt(2)=='e'&&str.charAt(3)=='l'){
            String del = str.charAt(0)+str.substring(4,str.length());
            return del;
        }
        return str;
    }

}
