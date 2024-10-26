public class LinearSearch {
    public static int find(int arr[],int target){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==target)
                return i;
        }
        return -1;
    }
    public static int find(String s,char target){
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)==target)
                return i;
        }
        return -1;
    }
    public static int[] find(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target)
                    return new int[]{row,col};

            }

        }
        return new int[] {-1,-1};
    }
}
