
/*
Dynamically Sized Sliding Window: Given an array of positive integers, find the subarrays of integers that add up to a given number
Example Input: [1, 7, 4, 3, 1, 2, 1, 5, 1]

Desired Sum: 7

https://quanticdev.com/algorithms/dynamic-programming/sliding-window/
 */
public class DynamicallySizedWindow {
    public static void main(String[] args) {
        int target = 7;
        int[] arr = new int[]{1, 7, 4, 3, 1, 2, 1, 5, 1,1};
        findSubarray(arr,target);
    }

    private static void findSubarray(int[] arr, int target) {
        int curSum = 0;
        int left = 0,right = 0;

        for(int i=0;i<arr.length;i++){
            curSum = curSum + arr[i];

            if(curSum == target){
                System.out.println(left+" "+right);
//                break;
            }
//            System.out.println("sum = "+ curSum);

            // shrink the window from left to obtain curSum < target
            while(curSum > target) {
                curSum -= arr[left];
                left++;
                if(curSum == target){
                    System.out.println(left+" "+right);
                    break;
                }
            }
            right++;
        }
    }
}
