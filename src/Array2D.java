import java.util.*;
public class Array2D {
    public static void main(String[] args) {
        // int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        // int sum=0;
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr[i].length;j++){
        //         // System.out.print(arr[i][j]+ " ");
        //         sum=sum+arr[i][j];
        //     }
        //     // System.out.println(sum);
        //     // System.out.println();
        // }
        // System.out.println(sum);
        // int max=0;
        Scanner in =new Scanner(System.in);
        System.out.println("enter no of rows");
        int rows= in.nextInt();
        System.out.println("enter no of columns");
        int columns= in.nextInt();
        int[][] matrix=new int[rows][columns];
        System.out.println("enter element of matrix: ");
        for(int i=0;i<rows;i++){
             for(int j=0;j<columns;j++){
                matrix[i][j]=in.nextInt();
             }
        }
        System.out.println("matrix: ");
         for(int i=0;i<rows;i++){
             for(int j=0;j<columns;j++){
                System.out.print(matrix[i][j]+" "); 
             }
             System.out.println();
        }
        int[][] transpose=new int[columns][rows];
         for(int i=0;i<rows;i++){
             for(int j=0;j<columns;j++){
               transpose[i][j]=matrix[j][i];
             }
        }
        System.out.println("transpose: ");
         for(int i=0;i<rows;i++){
             for(int j=0;j<columns;j++){
                System.out.print(transpose[i][j]+" "); 
             }
             System.out.println();
        }
        in.close();
    }
}
