public class Day_1 {
    void Max(){
		System.out.println("hehehhe");
	}
	public static void main(String[] args) {
		// System.out.println("hello");
		// int[] arr={1,2,3,4,5,6,7};
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
		// int sum=0;
		// for(int i=0;i<arr.length;i++){
		// 	sum=sum+arr[i];
		// }
		// System.out.println(sum);
		// Scanner sc=new Scanner(System.in);
		// System.out.println("enter size of array:");
		// int n = sc.nextInt();
		// int[] arr= new int[n];
		// for(int i=0;i<n;i++){
		// 	arr[i]=sc.nextInt();
		// }
		// for(int k=0;k<arr.length;k++){
        //   System.out.println(arr[k]);
		// }
		// int[] arr={1,2,3,4};
		// for(int i=0;i<arr.length;i++){
		// 	for(int j=0;j<arr.length;j++){
             
		// 	}
		// }
		// int[] arr1={1,2,3,4,5};
		// int[] arr2={4,2,4,2,4};
		// int sum=0;
		// for(int i=0;i<arr1.length;i++){
		// 	sum=sum+arr1[i]+arr2[i];
		// }
		// System.out.println(sum);
		int[] arr1={1,2,3,4,5};
		int[] arr2={2,4,2,4,2};
		int[] arr3=new int[arr1.length+arr2.length];
		for(int i=0;i<arr1.length;i++){
           arr3[i]=arr1[i];
		}
		for(int k=0;k<arr2.length;k++){
           arr3[arr1.length+k]=arr2[k];
		}
		int max=arr3[0];
		for(int j=0;j<arr3.length;j++){
        //    System.out.println(arr3[j]);
		if(arr3[j]>max){
			max=arr3[j];
		}
		}
		System.out.println(max);

		


	}


}
