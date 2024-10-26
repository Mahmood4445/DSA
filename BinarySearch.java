public class BinarySearch {
    public static int find(int[] arr,int target){
        int start =0;
        int stop= arr.length-1;
        while (start<=stop){
            int mid = (start+stop)/2;
            if (arr[mid]<target)
                start= mid +1;
            else if (arr[mid]>target)
                stop = mid-1;
            else
                return mid;


        }
        return -1;
    }
}
