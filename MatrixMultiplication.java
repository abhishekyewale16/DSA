public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] A = {{1, 2, 3}, {4, 5, 6}};
        int[][] B = {{7, 8}, {9, 10}, {11, 12}};

        if (A[0].length != B.length) {
            System.out.println("Cannot multiply: invalid dimensions.");
            return;
        }

        int[][] result = new int[A.length][B[0].length];
        for (int i = 0; i < A.length; i++)
            for (int j = 0; j < B[0].length; j++)
                for (int k = 0; k < A[0].length; k++)
                    result[i][j] += A[i][k] * B[k][j];

        System.out.println("Matrix A:");
        print(A);
        System.out.println("Matrix B:");
        print(B);
        System.out.println("Result (A * B):");
        print(result);
    }

    static void print(int[][] matrix) {
        for (int[] row : matrix) {
            for (int x : row)
                System.out.print(x + " ");
            System.out.println();
        }
    }
}