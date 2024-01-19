import java.util.Scanner;

public class searching {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {18,12,-7,3,14,28};
        System.out.println("enter your start and end index");
        int start = in.nextInt();
        int end = in.nextInt();
        int target = in.nextInt();
        System.out.println(linearSearch(arr,start,end,target));
    }
    static int linearSearch(int[] arr,int start,int end,int target){
        for (int i = start;i<=end;i++){
            if (target == arr[i]){
                return i;
            }
        }
        return 0;
    }

}


