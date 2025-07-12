public class SlidingWindow {
    public static int evenWindow(int[] arr) { 
    int even=0;
        int k=3;
        for(int i=0;i<k;i++){
            if(arr[i]%2==0){
                even++;
            }
        }
        System.out.println(even);
        for(int i=k;i<arr.length;i++){
          if(arr[i]%2==0){
            even++;
          }
          else if(arr[i-k]%2==0){
            even--;
          }
          System.out.println(even);
        }
        
        return even;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        evenWindow(arr);
    }
}

