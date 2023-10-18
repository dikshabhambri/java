public class SearchInSortedMatrix {
    public static boolean Search(int matrix[][], int key){
        int row = 0, col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key){
                System.out.println(row + "," + col);
                return true;
            }
            else if(key <matrix[row][col]){
                col--;

            }
            else{
                row++;
            }


            }
            return false;

            

            }
            public static void main (String args[]){
                Scanner sc = new Scanner (System.in);
                int n = sc.nextInt();
                int matrix [][] = new int [n][n];
                for(int i =0; i<matrix.length; i++){
                    for(int j =0; j<matrix[0].length; j++){
                        matrix[i][j] = sc.nextInt();
                    }
                }
                int key = sc.nextInt();
                Search(matrix,key);
            }
        }

    

