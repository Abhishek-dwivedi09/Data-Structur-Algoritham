package TwodArrays;

import java.util.ArrayList;
import java.util.List;

public class SetMatrixZero {

    static void bruteForce(int [][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;

        List<int[]> zeroPositions = new ArrayList<>();

        // Step 1: Store the positions of all zeros
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    zeroPositions.add(new int[]{i, j});
                }
            }
        }

        // Step 2: For each stored position, set row and column to 0
        for (int[] pos : zeroPositions) {
            int row = pos[0];
            int col = pos[1];

            // Set entire row to 0
            for (int j = 0; j < cols; j++) {
                matrix[row][j] = 0;
            }

            // Set entire column to 0
            for (int i = 0; i < rows; i++) {
                matrix[i][col] = 0;
            }
        }

        // printing the remaining elements
        for(int i  =0; i< matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }



    }


    public static void main(String[] args) {

      int [][]  matrix = {{1,1,1},{1,0,1},{1,1,1}};

           bruteForce(matrix);

    }
}
