
// https://www.youtube.com/watch?v=TsA4vbtfCvo
class Solution {
    // consider this as circular array and you will come to the point that the solution will be sliding window algorithm
    public int maxScore(int[] cardPoints, int k) {
        int total_sum = 0;
        int len = cardPoints.length;
        // find total sum to get the sum of outside of window
        for(int i=0;i<cardPoints.length;i++){
            total_sum+=cardPoints[i]; // prefix sum
        }
        if(k == len){
            return total_sum;            
        }
        // slide window of n-k size
        int curSum = 0;
        int ans = 0;
        int window_len = cardPoints.length - k - 1; // window length to get the outside total
        int left = 0,right = 0;
        for(int i=0;i<cardPoints.length;i++){
            curSum += cardPoints[i];
            if(right-left == window_len){
                ans = Math.max(ans,total_sum-curSum);     // subtracting total sum with current window sum to obtain the outside of the window total.
                curSum -= cardPoints[left];
                left++;
            }
            right++;
        }
        return ans;
    }
}
