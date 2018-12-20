package codingbat.com.Array2;

public class more14 {

//    Given an array of ints, return true if the number of 1's is greater than the number of 4's
//
//    more14([1, 4, 1]) → true
//    more14([1, 4, 1, 4]) → false
//    more14([1, 1]) → true

    public boolean more14(int[] nums) {
        int one = 0;
        int four = 0;
        for (int a : nums){
            if(a==1){
                one=one+1;
            }
            if(a==4){
                four=four+1;
            }
        }
        if(one>four){
            return true;
        }
        return false;
    }

}
