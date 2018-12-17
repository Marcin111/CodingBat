package codingbat.com.Array1;

public class front11 {

//    Given 2 int arrays, a and b, of any length, return a new array with the first element of each array. If either array is length 0, ignore that array.
//
//    front11([1, 2, 3], [7, 9, 8]) → [1, 7]
//    front11([1], [2]) → [1, 2]
//    front11([1, 7], []) → [1]

    public int[] front11(int[] a, int[] b) {
        if (a.length>0 && b.length>0){
            int[] array = new int[2];
            array[0]=a[0];
            array[1]=b[0];
            return array;
        } else if (a.length>0 && b.length==0){
            int[] array = new int[]{a[0]};
            return array;
        } else if (a.length==0 && b.length>0){
            int[] array = new int[]{b[0]};
            return array;
        } else {
            int[] array = new int[0];
            return array;
        }
    }

}
