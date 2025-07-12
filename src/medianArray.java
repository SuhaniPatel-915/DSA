import java.util.Arrays;

public class medianArray {
    static public double findMedianSortedArrays(int[] nums1,int[] nums2){
        int[] mergeARR=new int[nums1.length+nums2.length];
         int index=0;
         for(int x: nums1){
            mergeARR[index++]=x;
         }
         for(int x: nums2){
            mergeARR[index++]=x;
         }
         Arrays.sort(mergeARR);
         int n=mergeARR.length;
         if(n%2==0){
            return (mergeARR[n/2-1]+mergeARR[n/2])/2.0;
         }
         else{
            return mergeARR[n/2];
         }
    }
    public static void main(String[] args) {
        int[] nums1={1,2,3};
        int[]  nums2={4,5,6};
       double data=findMedianSortedArrays(nums1,nums2);
       System.out.println(data);
    }
}
