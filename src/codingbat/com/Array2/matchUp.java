package codingbat.com.Array2;

public class matchUp {

//    Given arrays nums1 and nums2 of the same length, for every element in nums1, consider the corresponding element in nums2 (at the same index). Return the count of the number of times that the two elements differ by 2 or less, but are not equal.
//
//    matchUp([1, 2, 3], [2, 3, 10]) → 2
//    matchUp([1, 2, 3], [2, 3, 5]) → 3
//    matchUp([1, 2, 3], [2, 3, 3]) → 2

    public int matchUp(int[] nums1, int[] nums2) {
        int a = 0;
        for (int i = 0; nums1.length>i; i++){
            if((Math.abs(nums1[i]-nums2[i]))<=2 && nums1[i]!=nums2[i]){
                a=a+1;
            }
        }
        return a;
    }

}
