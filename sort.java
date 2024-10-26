import java.util.Arrays;

public class sort {
    public static void selection_sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int min_index=i;
            for (int j = i; j <arr.length ; j++) {
                if (arr[j]<min){
                    min=arr[j];
                    min_index=j;
                }

            }
            int temp = arr[i];
            arr[i]=min;
            arr[min_index]= temp;
        }
    }
    public static void bubble_sort(int[] arr){
        for (int i = 1; i <arr.length ; i++) {
            boolean swape =false;
            for (int j = 0; j < arr.length-i; j++) {
                if (arr[j]>arr[j+1]){
                    swape = true;
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }
            if(swape==false)
                break;

        }
    }
    public static void insertion_sort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j]<arr[j-1]){
                    int temp =arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                else
                    break;
            }

        }
    }
    public static int[] merge_sort(int[] arr){
        if(arr.length==1)
            return arr;
        int mid = arr.length/2;
        int[] left = merge_sort(Arrays.copyOfRange(arr,0,mid));
        int[] right = merge_sort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }
    public static int[] merge(int[] first,int[] second){
        int[] joined = new int[first.length+second.length];
        int i=0,j=0,k=0;
        while (i< first.length && j < second.length){
            if (first[i]<second[j])
                joined[k++] = first[i++];
            else
                joined[k++] =second[j++];
        }
        while(i<first.length)
            joined[k++] = first[i++];
        while(j<second.length)
            joined[k++] =second[j++];

        return joined;
    }
    public static void quick_sort(int[] arr, int low,int high){
        if(low>=high)
            return;
        int start = low;
        int end = high;
        int mid =(start+end)/2;
        int pivot = arr[mid];
        while(start<=end){
            while(arr[start]<pivot)
                start++;
            while(arr[end]>pivot)
                end--;
            if (start<=end){
                int temp =arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start ++;
                end--;
            }

        }
        quick_sort(arr,low,end);
        quick_sort(arr,start,high);
    }

}
