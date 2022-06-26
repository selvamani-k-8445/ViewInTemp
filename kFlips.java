/*
    Flipping/Swapping: Given an array of 0’s and 1’s, find the maximum sequence of continuous 1’s that can be formed by flipping at-most k 0’s to 1’s
Example Input: [0, 1, 0, 1, 0, 0, 1, 1]
                0  1  2  3  4  5  6  7
Max Flips (k): 2
https://quanticdev.com/algorithms/dynamic-programming/sliding-window/
 */
public class KFlips {
    static int findMaxSeqOfContinuousOnes(int[] arr, int maxFlips){
        int left = 0,right = 0;
        int no_of_flips = 0;
        int max_elements = 0, curMax = 0;
        for(int i=0;i<arr.length;i++){
            // check to flip
            if(arr[i] == 0){
                no_of_flips++;
            }
            
            // when no of flips exceed, shring the window from left until the no of flips comes under max flips
            while( no_of_flips > maxFlips && left < arr.length){
                if( arr[left]==0){
                    no_of_flips--;
                }
                left++;
            }
            // obtain max no of elements in the window
            if(right-left > max_elements){
                max_elements = right-left;
            }
            right++;
        }
        return max_elements+1;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 0, 1, 0, 0, 1, 1};
        int max_flips = 2;
        System.out.println(findMaxSeqOfContinuousOnes(arr,max_flips));
    }
}
