import java.util.Scanner;

public class maxAndmin {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,7,8};
        int max=arr[0];
        int currMax=0;
        Scanner sc=new Scanner(System.in);
        int kh=sc.nextInt();
        for(int i=0;i<=kh;i++){  
            // max=Math.max(max,currMax);
            for(int j=0;j<arr.length;j++){
                max=Math.max(max,currMax);
            }

        }

    }
}
