package codingbat.com.Array2;

public class shiftLeft {

//    Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}. You may modify and return the given array, or return a new array.
//
//    shiftLeft([6, 2, 5, 3]) → [2, 5, 3, 6]
//    shiftLeft([1, 2]) → [2, 1]
//    shiftLeft([1]) → [1]

    public int[] shiftLeft(int[] nums) {

        int[] shift = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (i != nums.length - 1) {
                shift[i] = nums[i + 1];
            } else {
                shift[nums.length - 1] = nums[0];

            }
        }
        return shift;
    }

}
