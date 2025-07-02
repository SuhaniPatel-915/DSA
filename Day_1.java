
public class Day_1 {

	public static void main(String[] args) {
		// System.out.println("hello");
		int[] arr={1,2,3,4,5,6,7};
		// int max=arr[0];
        // for(int i=0;i<arr.length;i++){
		// 	if(arr[i]>max){
		// 		max=arr[i];
		// 	}
		// }
		// System.out.println(max);
		// int min=arr[0];
		// for(int i=0;i<arr.length;i++){
		// 	if(arr[i]<min){
		// 		min=arr[i];
		// 	}
		// }
		// System.out.println(min);
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum=sum+arr[i];
		}
		System.out.println(sum);
	}

}
