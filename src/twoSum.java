import java.util.Arrays;
import java.util.HashMap;

public class twoSum {
    public static int[] twoSum(int[] nums,int target) {
    HashMap<Integer,Integer>map=new HashMap<>();
    for(int i=0;i<nums.length;i++){
        int diff=target-nums[i];
        if(map.containsKey(diff)){
            return new int[] {map.get(diff),i};
        }
        map.put(nums[i],i);
    }
    return new int[] {};
  }
    // static int[] twoSum(int[] arr){
    //     int target=3;
    //     for(int i=0;i<arr.length;i++){
    //        int temp=target-arr[i];
    //        for(int j=i+1;j<arr.length;j++){
    //         if(arr[j] == temp){
    //           return new int[]{i,j};
    //         }  
    //     }
    // }
    // return new int[]{};

    public static void main(String[] args) {
        int[] nums={2,7,0,5,6};
        int[] data=twoSum(nums, 9);
        System.out.println(Arrays.toString(data));

    }
}
