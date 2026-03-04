//3194. Minimum Average of Smallest and Largest Elements
//Problem: Reverse String Prefix
//Fixed type casting doubts
  

class Solution {
    public double minimumAverage(int[] nums) {
        double ans = Double.MAX_VALUE ;
        int high = nums.length - 1 , low = 0 ;
        Arrays.sort(nums);
        while(low < high){
            int sum = nums[low] + nums[high];
            double avg = (double) sum / 2.0 ;
            if(ans > avg) ans = avg ;
            low++ ;
            high-- ;
        }
        return ans ;
    }
}
