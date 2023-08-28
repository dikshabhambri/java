import java.util.*;
public class DiagonalSum {
    public static int DS(int matrix[][]){
        int sum = 0;
        for(int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[0].length; j++){
                if (i==j){
                    sum += matrix[i][j];
                }
                else if(i+j == matrix.length-1){
                    sum+= matrix[i][j];
                }
            }
            

        }
        return sum;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int matrix[][] = new int [n][n];
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                matrix[i][j] = sc.nextInt();
                
            }

        }
        System.out.println(DS(matrix));

        

    }
}
