package codingbat.com.Array2;

public class evenOdd {

//    Return an array that contains the exact same numbers as the given array, but rearranged so that all the even numbers come before all the odd numbers. Other than that, the numbers can be in any order. You may modify and return the given array, or make a new array.
//
//    evenOdd([1, 0, 1, 0, 0, 1, 1]) → [0, 0, 0, 1, 1, 1, 1]
//    evenOdd([3, 3, 2]) → [2, 3, 3]
//    evenOdd([2, 2, 2]) → [2, 2, 2]

    public int[] evenOdd(int[] nums) {
        int[] array = new int[nums.length];
        int odd = nums.length-1;
        int even = 0;
        for ( int i = 0; i<nums.length; i++){
            if (nums[i]%2==0){
                array[even]=nums[i];
                even++;
            } else {
                array[odd]=nums[i];
                odd--;
            }
        }
        return array;
    }

}
