public class postfixSum {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int[] postfixSum=new int[arr.length];
        postfixSum[arr.length-1]=arr[arr.length-1];
        for(int i=arr.length-2; i>=0;i--){
            postfixSum[i]=arr[i+1]+arr[i];
        }
        for(int x:postfixSum){
            System.out.println(x);
        }
    }
}
