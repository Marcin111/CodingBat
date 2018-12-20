package codingbat.com.Array2;

public class lucky13 {

//    Given an array of ints, return true if the array contains no 1's and no 3's.
//
//    lucky13([0, 2, 4]) → true
//    lucky13([1, 2, 3]) → false
//    lucky13([1, 2, 4]) → false

    public boolean lucky13(int[] nums) {
        for (int a : nums){
            if (a==1 || a==3){
                return false;
            }
        }
        return true;
    }

}
