package codingbat.com.String2;

public class getSandwich {

//    A sandwich is two pieces of bread with something in between. Return the string that is between the first and last appearance of "bread" in the given string, or return the empty string "" if there are not two pieces of bread.
//
//    getSandwich("breadjambread") → "jam"
//    getSandwich("xxbreadjambreadyy") → "jam"
//    getSandwich("xxbreadyy") → ""

    public String getSandwich(String str) {
        int start = 0;
        int end = 0;
        for (int i = 0; i<str.length()-5; i++){
            if (str.substring(i,i+5).equals("bread")){
                start = i+5;
                for (int j =str.length(); j>i+5; j-- ){
                    if(str.substring(j-5,j).equals("bread")){
                        end = j-5;
                        break;
                    }
                }
                break;
            }
        }
        return (end>0)?str.substring(start,end):"";
    }

}
