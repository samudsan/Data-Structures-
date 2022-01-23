package recursion;

public class _2_IsArraySorted {

    public static void main(String[] args) {
        int[] arr = {1, 2, 7, 4, 5};
        int n = arr.length;
        if(isSorted(arr,n) != 0)
            System.out.println("Array is sorted");
        else
            System.out.println("Array  Not sorted");
    }

    public static int isSorted(int [] arr, int n){
        if(n==1 || n==0)
            return 1;
        if(arr[n-1] < arr[n-2])
            return 0;
        return isSorted(arr, n-1);
    }
}
