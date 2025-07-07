import java.util.Scanner;

public class SymArray {
    public static void main(String[] args) {
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
        // System.out.println("matrix: ");
        //  for(int i=0;i<rows;i++){
        //      for(int j=0;j<columns;j++){
        //         System.out.print(matrix[i][j]+" "); 
        //      }
        //      System.out.println();
        // }
        // int[][] transpose=new int[columns][rows];
        //  for(int i=0;i<rows;i++){
        //      for(int j=0;j<columns;j++){
        //        transpose[i][j]=matrix[j][i];
        //      }
        // }
        // System.out.println("transpose: ");
        //  for(int i=0;i<rows;i++){
        //      for(int j=0;j<columns;j++){
        //         System.out.print(transpose[i][j]+" "); 
        //      }
        //      System.out.println();
        // }
        // if(matrix[rows][columns]==transpose[columns][rows]){
        //   System.out.println("Symetric matrix");
        // }
        // else{
        //     System.out.println("not symetric");
        // }
        if(rows!=columns){
            System.out.println("not valid");
        }
        else{
            for(int i=0;i<rows;i++){

            }
        }

        in.close();
    }
}
