public class MaxSubArray {
    public static int maxSubArray(int[] nums) { 
        int currSum=0;
        int maxSum=nums[0]; 
        for(int num:nums){
            currSum=Math.max(num,currSum+num);
            maxSum=Math.max(maxSum,currSum);
        }
        return maxSum;
        // int max=Integer.MIN_VALUE;
        // int k=3;
        // int n=nums.length;
        // int windoSum=0;
        // for(int i=0;i<k;i++){
        //     windoSum+=nums[i];
        // }
        // for(int i=k;i<n;i++){
        //     windoSum+=nums[i]-nums[i-k];
        //     max=Math.max(windoSum,max);
        // }
        
        // for(int i=0;i<=n-k;i++){
        //     int currSum=0;
        //     for(int j=i;j<i+k;j++){
        //     currSum+=nums[j];
        //     max=Math.max(currSum,max);

        // }
        // }
        // return max;
    }
    public static void main(String[] args) {
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}
