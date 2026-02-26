public class MatrixSubtraction {
    public static void main(String[] args) {
        
        int[][] matrixA = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };

        int[][] matrixB = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

       
        int rows = matrixA.length;
        int columns = matrixA[0].length;
        int[][] result = new int[rows][columns];

        // Perform subtraction
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = matrixA[i][j] - matrixB[i][j];
            }
        }

        System.out.println("Result of Matrix Subtraction:");
        for (int[] row : result) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}