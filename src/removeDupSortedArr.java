public class removeDupSortedArr {
    public static int removeDuplicates(int[] nums) {
        int n=nums.length;
        int it=1;
        for(int i=1;i<n;i++){
            if(nums[i]!=nums[i-1]){
                nums[it++]=nums[i];
            }
        }
       
        return it;
    }
    public static void main(String[] args) {
        int[] nums={1,2,3,1,2,5};
        int data=removeDuplicates(nums);
        System.out.println(data);
    }
}
