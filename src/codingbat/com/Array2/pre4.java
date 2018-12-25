package codingbat.com.Array2;

public class pre4 {

//    Given a non-empty array of ints, return a new array containing the elements from the original array that come before the first 4 in the original array. The original array will contain at least one 4. Note that it is valid in java to create an array of length 0.
//
//    pre4([1, 2, 4, 1]) → [1, 2]
//    pre4([3, 1, 4]) → [3, 1]
//    pre4([1, 4, 4]) → [1]

    public int[] pre4(int[] nums) {
        int length = 0;
        for (int i = 0; nums.length > i; i++) {
            if (nums[i] == 4) {
                length = i;
                break;
            }
        }
        int[] array = new int[length];
        for (int j = 0; j < array.length; j++) {
            array[j] = nums[j];
        }
        return array;
    }

}
