public class minNum {
    public static void main(String[] args) {
        int[] arr = {18,12,-7,3,14,28};
        System.out.println(min(arr));
    }
    static int min(int[] arr){
        int minimum = arr[0];
        for (int i =0;i<=arr.length-1;i++){
            if (minimum > arr[i]){
                minimum = arr[i];
            }
        }
        return minimum;
    }
}
