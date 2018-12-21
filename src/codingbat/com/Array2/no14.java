package codingbat.com.Array2;

public class no14 {

//    Given an array of ints, return true if it contains no 1's or it contains no 4's.
//
//    no14([1, 2, 3]) → true
//    no14([1, 2, 3, 4]) → false
//    no14([2, 3, 4]) → true

    public boolean no14(int[] nums) {
        boolean one = false;
        boolean four = false;
        for (int i = 0; i<nums.length; i++){
            if (nums[i]==1 ||nums[i]==4){
                if (nums[i]==1){
                    one = true;
                }
                if(nums[i]==4){
                    four=true;
                }
            }
        }
        if(one && four){
            return false;
        }
        return true;
    }

}
