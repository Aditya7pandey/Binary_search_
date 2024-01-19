public class CeilingOfNum {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 3;
        int ans = Ceiling(arr,target);
        System.out.println(arr[ans]);
    }
    static int Ceiling(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while(true){
            int mid = start + (end-start)/2;
            if (arr[mid] == target){
                return mid;
            }
            if (arr[mid] < target){
                start = mid +1;
            }
            if (arr[mid] >  target){
                end = mid -1;
            }
            if (start == end){
                return start;
            }
        }
    }
}
