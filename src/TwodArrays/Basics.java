package TwodArrays;

public class Basics {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        // here matrix length will be 3;
        System.out.println("row wise traverser");

        // traverse row wise
        for(int i  =0; i< matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("column wise traverser");

        // traverse column wise
        for(int i=0; i<matrix[0].length; i++){
            for(int j=0; j<matrix.length; j++){
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println();

        }

        // find max element in matrix
        int max =0;
        for (int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                 if(matrix[i][j]>max)
                     max = matrix[i][j];
            }
        }

        System.out.println(max);

        // transpose of matrix


    }
}
