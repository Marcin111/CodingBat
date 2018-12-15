package codingbat.com.Array1;

public class makeLast {

//    Given an int array, return a new array with double the length where its last element is the same as the original array, and all the other elements are 0. The original array will be length 1 or more. Note: by default, a new int array contains all 0's.
//
//    makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6]
//    makeLast([1, 2]) → [0, 0, 0, 2]
//    makeLast([3]) → [0, 3]

    public int[] makeLast(int[] nums) {
        int[] array = new int[nums.length*2];
        array[nums.length*2-1]=nums[nums.length-1];
        return array;
    }

}
