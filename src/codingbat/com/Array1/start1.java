package codingbat.com.Array1;

public class start1 {

//    Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as their first element.
//
//    start1([1, 2, 3], [1, 3]) → 2
//    start1([7, 2, 3], [1]) → 1
//    start1([1, 2], []) → 1

    public int start1(int[] a, int[] b) {
        int lena = a.length;
        int lenb = b.length;
        int c = 0;

        if (lena!=0){
            if (a[0]==1){
                c=c+1;
            }
        }

        if (lenb!=0){
            if (b[0]==1){
                c=c+1;
            }
        }
        return c;
    }

}
