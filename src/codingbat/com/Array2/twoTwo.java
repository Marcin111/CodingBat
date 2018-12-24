package codingbat.com.Array2;

public class twoTwo {

//    Given an array of ints, return true if every 2 that appears in the array is next to another 2.
//
//    twoTwo([4, 2, 2, 3]) → true
//    twoTwo([2, 2, 4]) → true
//    twoTwo([2, 2, 4, 2]) → false

    public boolean twoTwo(int[] nums) {
        boolean param = false;

        if (nums.length==0){
            return true;
        }

        if(nums.length==1 && nums[nums.length-1]==2){
            return false;
        }

        if(nums.length>1 && nums[nums.length-1]==2 && nums[nums.length-2]!=2){
            return false;
        }

        for(int i = 1; i<nums.length; i++){
            if(nums[i]==2){
                if(nums[i-1]==2 || nums.length>i+1 && nums[i+1]==2){
                    param = true;
                } else {
                    return false;
                }
            }
        }
        for(int a : nums){
            if(a!=2){
                param = true;
            }
        }
        return param;
    }

}
