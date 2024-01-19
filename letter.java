public class letter {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char ans = change(letters,'c');
        System.out.println(ans);
    }
    static char change(char[] letters, char target) {
        int start = 0;
        int end = letters.length-1;
//        if (letters[end] < target){
//            return letters[start];
//        }
        while(start<=end){
            int mid = start +(end - start)/2;

//            if (letters[mid]==target){
//                start = mid +1;
//            }
            if (letters[mid]<target){
                start = mid +1;
            }
            if (letters[mid]>target){
                end = mid - 1;
            }
        }
        return letters[start % letters.length];
    }
}
